/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
//         if(head ==null){
//             return false;
//         }
//         ListNode slow=head;
//          ListNode fast=head.next;
        
//         while(slow!=fast){
//             if(fast==null||fast.next==null){
//                 return false;
//             }
//             slow=slow.next;
//             fast=fast.next.next;
//         }
//         return true;
        
        Set<ListNode>st= new HashSet<>();
        while(head!=null){
            if(st.contains(head)){
                return true;
            }else{
                st.add(head);
                head=head.next;
            }
        }
        return false;
    }
}