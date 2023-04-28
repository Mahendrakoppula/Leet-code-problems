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
    public boolean isPalindrome(ListNode head) {
          // ArrayList<Integer> al= new ArrayList<>();

 //        while(head!=null){
 //            al.add(head.val);
 //            head=head.next;
 //        }
 //        System.out.println(al);
 //        int n=al.size();
 //        for (int i = 0; i < n/2; i++) {
 //            if(al.get(i)!=al.get(n-i-1)){
 //                return false;
 //            }
 //    }
 // return true;       
        
//          Stack<Integer>st= new Stack<>();
//         while(head!=null){
// //            al.add(head.value);
//             if( st.isEmpty()){

//                 st.push(head.val);
//             }else if (head.val==st.peek()){
//                 st.pop();
//             }else {
//             st.push(head.val);
//         }
//             head=head.next;
//         }
//         if(st.empty()||st.size() == 1){
//             return true;
//         }
//         return false;
        
        ArrayList<Integer> original = new ArrayList<>();
    ArrayList<Integer> reversed = new ArrayList<>();
    while (head != null) {
        original.add(head.val);
        reversed.add(0, head.val);
        head = head.next;
    }
    if (original.equals(reversed)) {
        return true;
    } 
        return false;
}
}