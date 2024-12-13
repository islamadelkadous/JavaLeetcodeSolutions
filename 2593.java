class Solution {
    public long findScore(int[] nums) {
        int size = nums.length;
        boolean[] marked = new boolean[size];
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        for (int i = 0; i < size; i++) {
            q.offer(new int[]{nums[i], i});
        }
        long totalScore = 0;
        while (!q.isEmpty()) {
            int[] currentPair = q.poll();
            if (!marked[currentPair[1]]) {
                totalScore += currentPair[0];
                marked[currentPair[1]] = true;
                if (currentPair[1] > 0) {
                    marked[currentPair[1] - 1] = true;
                }
                if (currentPair[1] < size - 1) {
                    marked[currentPair[1] + 1] = true;
                }
            }
        }
        return totalScore;
    }
}
