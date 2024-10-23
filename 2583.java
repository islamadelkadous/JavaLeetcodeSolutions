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
    public long kthLargestLevelSum(TreeNode root, int k) {
        if (root == null) {
            return -1;
        }
        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            long sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                if (temp != null) {
                    if (temp.left != null) {
                        queue.offer(temp.left);
                    }
                    if (temp.right != null) {
                        queue.offer(temp.right);
                    }
                    sum += temp.val;
                }
            }
            minHeap.offer(sum);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        if (minHeap.size() < k || minHeap.isEmpty()) {
            return -1;
        }
        else {
            return minHeap.peek();
        }
    }
}
