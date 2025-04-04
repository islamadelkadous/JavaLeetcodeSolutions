class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        for (int num: nums) {
            numSet.add(num);
        }
        int maxSize = 0;
        for (int num : nums) {
            if (!numSet.contains(num - 1)) {
                int currMax = 1;
                while (numSet.contains(num + 1)) {
                    currMax++;
                    num++;
                }
                maxSize = Math.max(maxSize, currMax);
            }
        }
        return maxSize;
    }
}
