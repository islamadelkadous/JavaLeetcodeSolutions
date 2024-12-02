class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] splitedWords = sentence.split("\\s+");
        for (int i = 0; i < splitedWords.length; i++) {
            if (splitedWords[i].startsWith(searchWord)) {
                return i+1;
            }
        }
        return -1;
    }
}
