class Solution {
    public String makeFancyString(String s) {
        char currentChar = '#';
        int currentChatCount = 1;
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == currentChar) {
                currentChatCount++;
            } else {
                currentChar = c;
                currentChatCount = 1;
            }
            if (currentChatCount <= 2) {
                result.append(c);
            }
        }
        return result.toString();
    }
}
