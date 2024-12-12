class Solution {
    public long pickGifts(int[] gifts, int k) {
        Queue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int gift : gifts) {
            maxHeap.offer(gift);
        }
        for (int i = 0; i < k; i++) {
            int currentMax = maxHeap.poll();
            currentMax = (int) Math.floor(Math.sqrt((double) currentMax));
            maxHeap.offer(currentMax);
        }
        long ans = 0;
        while (!maxHeap.isEmpty()) {
            ans += maxHeap.poll();
        }
        return ans;
    }
}
