class Solution {
    public int longestSquareStreak(int[] nums) {
        int result = -1;
        HashSet<Long> numberSet = new HashSet<>();
        for (long num : nums) {
            numberSet.add(num);
        }
        for (long num : nums) {
            int currResult = 1;
            while (numberSet.contains(num*num)) {
                currResult++;
                num = num*num;
            }
            result = Math.max(currResult, result);
        }
        if (result > 1) {
            return result;
        }
        return -1;
    }
}
