class Solution {
    public int minimumLength(String s) {
        HashMap<Character, Integer> counterMap = new HashMap<>();
        int size = s.length();
        for (char c : s.toCharArray()) {
            counterMap.merge(c, 1, Integer::sum);
            if (counterMap.get(c).equals(3)) {
                size -= 2;
                counterMap.put(c, 1);
            }
        }
        return size;
    }
  /*
  class Solution {
  public int minimumLength(String s) {
    int ans = 0;
    int[] count = new int[26];

    for (final char c : s.toCharArray())
      ++count[c - 'a'];

    for (int i = 0; i < 26; ++i)
      if (count[i] > 0)
        ans += count[i] % 2 == 0 ? 2 : 1;

    return ans;
  }
}
  */
}
