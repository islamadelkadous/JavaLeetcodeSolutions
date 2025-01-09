class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String word : words) {
            if (word.startsWith(pref)) {
                count++;
            }
        }
        return count;
    }
  /*
  public int prefixCount(String[] words, String pref) {
    return (int) Arrays.stream(words).filter(w -> w.startsWith(pref)).count();
  }
  */
}
