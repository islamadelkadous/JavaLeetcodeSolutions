class Solution {
    public int findClosestNumber(int[] nums) {
        if (nums[0] == 1) {
            return 1;
        }
        int answer = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (Math.abs(nums[i]) < Math.abs(answer)) {
                answer = nums[i];
            } else if (Math.abs(nums[i]) == Math.abs(answer)) {
                answer = Math.max(nums[i], answer);
            }
        }
        return answer;
    }
}
