class Solution {
    public String compressedString(String word) {
        StringBuilder compressed = new StringBuilder();
        char currentChar = word.charAt(0);
        int currentCount = 1;
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == currentChar && currentCount < 9) {
                currentCount++;
            } else {
                compressed.append(currentCount);
                compressed.append(currentChar);
                currentChar = word.charAt(i);
                currentCount = 1;
            }
        }
        compressed.append(currentCount);
        compressed.append(currentChar);
        return compressed.toString();
    }
}
