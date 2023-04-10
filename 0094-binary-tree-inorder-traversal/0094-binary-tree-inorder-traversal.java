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
    public List<Integer> inorderTraversal(TreeNode root) {
         List<Integer> list=new ArrayList<>();
        
        Stack<TreeNode> st= new Stack<>();
        if(root==null){
            return list;
        }
        TreeNode temp= root;
        while(!st.isEmpty() || temp!=null){
            if(temp!=null){
                st.push(temp);
                temp=temp.left;
            }else{
                temp=st.pop();
                list.add(temp.val);
                temp=temp.right;
            }
        }
        return list;
        
        
        
//         traversal(root,list);
//         return list;
//     }

//     void traversal(TreeNode root,List<Integer> list){
//         if(root==null){
//             return;
//         }

//         traversal(root.left,list);
//         list.add(root.val);
//         traversal(root.right,list);
    }
}