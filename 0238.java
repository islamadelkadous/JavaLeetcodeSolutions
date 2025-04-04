class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        boolean hasZero = false;
        int totalProduct = 1;
        for (int num : nums) {
            if (num != 0) {
                totalProduct *= num;
            } else if (hasZero) {
                totalProduct *= num;
            } else {
                hasZero = true;
            }
        }

        for (int i = 0 ; i < nums.length ; i++) {
            if (hasZero) {
                if (nums[i] == 0) {
                    answer[i] = totalProduct;
                } else {
                    answer[i] = 0;
                }
            } else {
                answer[i] = totalProduct / nums[i];
            }
        }
        return answer;
    }
}
