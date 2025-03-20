class Solution {
    public int maxSubArray(int[] nums) {
        int sum = -999999;
        int ans = -9999999;
        for (int num : nums) {
            sum = Math.max(num, num + sum);
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
