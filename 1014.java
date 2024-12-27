class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int result = 0 , bestPrev = 0;
        for (int value : values) {
            result = Math.max(result, value + bestPrev);
            bestPrev = Math.max(bestPrev, value) - 1;
        }
        return result;
    }
}
