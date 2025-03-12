class Solution {
    public int maximumCount(int[] nums) {
        int countPos = 0, countNeg = 0;
        for (int num : nums) {
            if (num > 0) {
                countPos++;
            } else if (num < 0) {
                countNeg++;
            }
        }
        return Math.max(countPos, countNeg);
    }
}
/*
class Solution {
  public int maximumCount(int[] nums) {
    return (int) Math.max(Arrays.stream(nums).filter(num -> num > 0).count(),
                          Arrays.stream(nums).filter(num -> num < 0).count());
  }
}
*/
