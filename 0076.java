class Solution {
    public String minWindow(String s, String t) {
        // Edge case: if t is empty or s is shorter than t
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }
        
        // Create frequency map for characters in t
        HashMap<Character, Integer> charMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            charMap.merge(c, 1, Integer::sum);
        }
        
        int required = charMap.size(); // Number of unique characters to match
        int formed = 0; // Number of unique characters matched with required count
        HashMap<Character, Integer> windowCounts = new HashMap<>();
        
        int l = 0, r = 0; // Left and right pointers
        int minLen = Integer.MAX_VALUE, minStart = 0; // Track minimum window
        
        while (r < s.length()) {
            // Add character at r to window
            char c = s.charAt(r);
            windowCounts.merge(c, 1, Integer::sum);
            
            // Check if this character completes a required count
            if (charMap.containsKey(c) && windowCounts.get(c).equals(charMap.get(c))) {
                formed++;
            }
            
            // Shrink window from the left as much as possible
            while (l <= r && formed == required) {
                // Update minimum window if smaller
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    minStart = l;
                }
                
                // Remove character at l from window
                char leftChar = s.charAt(l);
                windowCounts.merge(leftChar, -1, Integer::sum);
                
                // If removing leftChar makes a required character's count insufficient
                if (charMap.containsKey(leftChar) && windowCounts.get(leftChar) < charMap.get(leftChar)) {
                    formed--;
                }
                
                l++;
            }
            
            r++;
        }
        
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}
