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
    public List<List<Integer>> levelOrder(TreeNode root) {
                List<List<Integer>> mainlist = new LinkedList<List<Integer>>();
        Queue<TreeNode> q= new LinkedList<>();
        if(root==null){
            return mainlist;
        }

        q.offer(root);

        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> l1= new ArrayList<>();
            for(int i=0;i<size;i++){
            TreeNode tr= q.poll();
            l1.add(tr.val);
            if(tr.left!=null){
                q.offer(tr.left);
            }
            if(tr.right!=null){
                q.offer(tr.right);
            }
        }
            mainlist.add(l1);
        }
    return mainlist;

        // q.add(root);
        // while(!q.isEmpty()){
        //     int n = q.size();
        //     List<Integer> ll =new LinkedList<Integer>();
        //     for(int i=0;i<n;i++){
        //         TreeNode cur=q.remove();
        //         ll.add(cur.val);
        //         if(cur.left!=null){
        //             q.add(cur.left);
        //         }
        //         if(cur.right!=null){
        //             q.add(cur.right);
        //         }
        //     }
        //     mainlist.add(ll);
        // }
        // return mainlist; 
    }
}