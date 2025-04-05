class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backTrack(result, current, 0, candidates, target, 0);
        return result;
    }

    private void backTrack(List<List<Integer>> result, List<Integer> current,
     int currSum, int[] candidates, int target, int start) {
        if(currSum == target) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (currSum > target || start == candidates.length) {
            return;
        }
        // Skip the current candidate
        backTrack(result, current, currSum, candidates, target, start + 1);

        // Include the current candidate
        current.add(candidates[start]);
        backTrack(result, current, currSum + candidates[start], candidates, target, start);
        current.remove(current.size() - 1);
     }
}
