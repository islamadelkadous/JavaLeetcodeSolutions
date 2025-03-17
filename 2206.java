class Solution {
    public boolean divideArray(int[] nums) {
        HashSet<Integer> pairsBuffer = new HashSet<>();
        for (int num : nums) {
            if (pairsBuffer.contains(num)) {
                pairsBuffer.remove(num);
            } else {
                pairsBuffer.add(num);
            }
        }
        return pairsBuffer.isEmpty();
    }
}
/*
class Solution {
  public boolean divideArray(int[] nums) {
    int[] count = new int[501];

    for (final int num : nums)
      ++count[num];

    return Arrays.stream(count).allMatch(c -> c % 2 == 0);
  }
}
*/
