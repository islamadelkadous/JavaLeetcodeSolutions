class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> remainingMap = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            if (remainingMap.containsKey(nums[i])) {
                return new int[] { remainingMap.get(nums[i]) , i};
            }
            remainingMap.put(target - nums[i], i);
        }
        return null;
    }
}
