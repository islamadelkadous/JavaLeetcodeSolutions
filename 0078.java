class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int length = nums.length;
        List<Integer> current = new ArrayList();
        List<List<Integer>> result = new ArrayList();
        backTrack(0, current, result, length, nums);
        return result;
    }

    private void backTrack(int start, List<Integer> current, List<List<Integer>> result, int length, int[] nums) {
        result.add(new ArrayList<>(current));
        for (int i = start; i < length; i++) {
            current.add(nums[i]);
            backTrack(i+1, current, result, length, nums);
            current.remove(current.size() - 1);
        }
    }
}
