class Solution {
  public int maximumBeauty(int[] nums, int k) {
        int left = 0, right = 0;
        Arrays.sort(nums);
        while (right < nums.length) {
            if (nums[right] - nums[left] > 2 * k) {
                left++;
            }
            right++;
        }
        return right - left;
    }
}
