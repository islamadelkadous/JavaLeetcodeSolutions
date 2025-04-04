class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int minLength = Integer.MAX_VALUE;
        for(String s : strs) {
            minLength = Math.min(minLength, s.length());
        }
        int ptr = 0;
        while (ptr < minLength) {
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].charAt(ptr) != strs[0].charAt(ptr)) {
                    return strs[0].substring(0, ptr);
                }
            }
            ptr++;
        }
        return strs[0].substring(0, ptr);
    }
}
