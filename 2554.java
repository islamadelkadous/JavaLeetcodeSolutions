class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int currentSum = 0, currentCount = 0;
        HashSet<Integer> bannedSet = Arrays.stream(banned)
                .boxed()
                .collect(Collectors.toCollection(HashSet::new));
        for (int i = 1; i <= n; i++) {
            if (!bannedSet.contains(i) && currentSum + i <= maxSum) {
                currentCount++;
                currentSum += i;
            }
        }
        return currentCount;
    }
}
