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
    public ListNode detectCycle(ListNode head) {
       Map<ListNode,Integer> mp= new HashMap<>();
        // ListNode curr
        while(head!=null){
            if(mp.containsKey(head)){
                return head;
            }else{
                mp.put(head,1);
                head=head.next;
            }
        }
        return null;
        
        
//          ListNode slow = head;
//     ListNode fast = head;
    
//     while (fast != null && fast.next != null) {
//         slow = slow.next;
//         fast = fast.next.next;
        
//         if (slow == fast) {
//             slow = head;
//             while (slow != fast) {
//                 slow = slow.next;
//                 fast = fast.next;
//             }
//             return slow;
//         }
//     }
    
//     return null;
}
}