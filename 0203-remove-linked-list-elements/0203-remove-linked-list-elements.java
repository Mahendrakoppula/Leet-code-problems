/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
        if(head==null){
            return null;
        }
        
        // ListNode temp=head;
        // if(temp.val==val){
        //     head=temp.next;
        // }
        // while(temp!=null){
        //     if(temp.next.value==val){
        //         temp.next.next=temp.next;
        //     }
        //     else if(temp.next.next==null && temp.next.value==val){
        //         temp.next=null;
        //     }
        //     temp=temp.next;
        // }
        
        ListNode dummy= new ListNode(0);
        dummy.next=head;
        
        ListNode prev=dummy;
        
        while(head!=null){
            if(head.val==val){
                prev.next=head.next;
            }else{
                prev=head;
            }
            head=head.next;
        }
        return dummy.next;
    }
}