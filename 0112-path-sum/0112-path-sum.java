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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        //  if (root == null) {
        //     return false;
        // }
        // if (root.left == null && root.right == null && targetSum == root.val) {
        //     return true;
        // }
        // return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
        
        if (root == null) {
        return false;
    }
    
    Stack<TreeNode> stack = new Stack<>();
    Stack<Integer> sumStack = new Stack<>();
    stack.push(root);
    sumStack.push(targetSum - root.val);
    
    while (!stack.isEmpty()) {
        TreeNode curr = stack.pop();
        int currSum = sumStack.pop();
        
        if (curr.left == null && curr.right == null && currSum == 0) {
            return true;
        }
        
        if (curr.right != null) {
            stack.push(curr.right);
            sumStack.push(currSum - curr.right.val);
        }
        
        if (curr.left != null) {
            stack.push(curr.left);
            sumStack.push(currSum - curr.left.val);
        }
    }
    
    return false;
    }
}