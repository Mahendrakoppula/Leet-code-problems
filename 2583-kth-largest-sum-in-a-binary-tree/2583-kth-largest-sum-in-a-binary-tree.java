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
            return -1L;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        List<Long> levelSums = new ArrayList<>();
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            long sum = 0;
            
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                sum += node.val;
                
                if (node.left != null) {
                    queue.offer(node.left);
                }
                
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            
            levelSums.add(sum);
        }
        
        Collections.sort(levelSums, Collections.reverseOrder());
        
        if (levelSums.size() < k) {
            return -1L;
        } else {
            return levelSums.get(k - 1);
        }
        
        
 
    }
}