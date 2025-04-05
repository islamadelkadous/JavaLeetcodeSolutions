class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backTrack(1, n, k, result, current);
        return result;
     }

     private void backTrack(int start, int n, int k, List<List<Integer>> result, List<Integer> current) {
        if(current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }
         for (int i = start; i <= n; i++) {
             if (!current.contains(i)) {
                 current.add(i);
                 backTrack(i + 1, n, k, result, current);
                 current.remove(current.size() - 1);
             }
         }
     }
}
