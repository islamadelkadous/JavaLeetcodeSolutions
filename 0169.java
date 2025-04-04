class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int maxCount = nums.length / 2;
        HashMap<Integer, Integer> counterMap = new HashMap<>();
        for (int num : nums) {
            if (!counterMap.containsKey(num)) {
                counterMap.put(num, 1);
            } else {
                int curr = counterMap.get(num);
                curr++;
                if (curr > maxCount) {
                    return num;
                }
                counterMap.put(num, curr);
            }
        }
        return 0;
    }
}
