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
    public List<Integer> postorderTraversal(TreeNode root) {
//          List<Integer> list=new ArrayList<>();
//         traversal(root,list);
//         return list;
//     }

//     void traversal(TreeNode root,List<Integer> list){
//         if(root==null){
//             return;
//         }

//         traversal(root.left,list);
//         traversal(root.right,list);
//         list.add(root.val);
        
        List<Integer> list= new ArrayList<>();
        Stack<TreeNode> st= new Stack<>();
        TreeNode current=root;
        
        while(current!=null || !st.isEmpty()){
            if(current!=null){
                st.push(current);
                current=current.left;
            }else{
                TreeNode temp= st.peek().right;
                if(temp==null){
                    temp=st.pop();
                    list.add(temp.val);
                    
                    while(!st.isEmpty()&&temp==st.peek().right){
                        temp=st.pop();
                        list.add(temp.val);
                    }
                }else{
                    current=temp;
                }
            }      
        }
        return list;
    }
}