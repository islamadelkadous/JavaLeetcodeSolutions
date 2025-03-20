class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        HashSet<Character> currentChars = new HashSet<>();
        int maxSize = 0;
        while (r < s.length()) {
            if (currentChars.contains(s.charAt(r))) {
                while (s.charAt(l) != s.charAt(r)) {
                    currentChars.remove(s.charAt(l));
                    l++;
                }
                currentChars.remove(s.charAt(l));
                l++;
            }
            currentChars.add(s.charAt(r));
            r++;
            maxSize = Math.max(maxSize, currentChars.size());
        }
        return maxSize;
    }
}
