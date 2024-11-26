class Solution {
    public int findChampion(int n, int[][] edges) {
        HashSet<Integer> losersSet = new HashSet<>();
        for (int[] edge : edges) {
            losersSet.add(edge[1]);
        }
        if (losersSet.size() != n - 1) {
            return -1;
        }
        for (int i = 0; i < n; i++) {
            if (!losersSet.contains(i)) {
                return i;
            }
        }
        return -1;
    }
}
