class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        Queue<t> minHeap = new PriorityQueue<t>((a, b) -> a.val == b.val ? a.index - b.index : a.val - b.val);
        for (int i = 0; i < nums.length; i++) {
            minHeap.offer(new t(nums[i], i));
        }
        for (int i = 0; i < k; i++) {
            minHeap.offer(new t(minHeap.peek().val * multiplier, minHeap.poll().index));
        }
        int[] answer = new int[nums.length];
        while (!minHeap.isEmpty()) {
            answer[minHeap.peek().index] = minHeap.poll().val;
        }
        return answer;
    }

    private record t(int val, int index) {}
}
