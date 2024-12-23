/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int minimumOperations(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>(List.of(root));
        int result = 0;
        while (!queue.isEmpty()) {
            List<Integer> vals = new ArrayList<>();
            List<Integer> ids = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (Objects.nonNull(node)) {
                    vals.add(node.val);
                    ids.add(i);
                    if (Objects.nonNull(node.left)) {
                        queue.offer(node.left);
                    }
                    if (Objects.nonNull(node.right)) {
                        queue.offer(node.right);
                    }
                }
            }
            ids.sort(Comparator.comparingInt(vals::get));
            for (int i = 0; i < ids.size(); ++i) {
                for (; ids.get(i) != i; ++result) {
                    swap(ids, i, ids.get(i));
                }
            }
        }
        return result;
    }

    private void swap(List<Integer> ids, int i, int j) {
        final int temp = ids.get(i);
        ids.set(i, ids.get(j));
        ids.set(j, temp);
    }
}
