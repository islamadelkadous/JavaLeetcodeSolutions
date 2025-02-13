class Solution {
    public int minOperations(int[] nums, int k) {
        Queue<Long> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.add((long) num);
        }
        int operations = 0;
        while (minHeap.size() > 1 && minHeap.peek() < k) {
            minHeap.add((minHeap.poll() * 2) + minHeap.poll());
            operations++;
        }
        return operations;
    }
}
