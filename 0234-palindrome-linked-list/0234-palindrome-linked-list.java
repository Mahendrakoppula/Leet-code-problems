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
        
    //     ArrayList<Integer> original = new ArrayList<>();
    // ArrayList<Integer> reversed = new ArrayList<>();
    // while (head != null) {
    //     original.add(head.val);
    //     reversed.add(0, head.val);
    //     head = head.next;
    // }
    // if (original.equals(reversed)) {
    //     return true;
    // } 
    //     return false;
        
        
//         Stack<Integer> stack = new Stack<>();
//     ListNode curr = head;
//     while (curr != null) {
//         stack.push(curr.val);
//         curr = curr.next;
//     }
//     curr = head;
//     while (curr != null) {
//         if (curr.val != stack.pop()) {
//             return false;
//         }
//         curr = curr.next;
//     }
//     return stack.isEmpty();
        
//         Stack<Integer>st= new Stack<>();
//         if()
//         while(head!=null){
// //            al.add(head.value);
//             if( st.isEmpty()){
//                 st.push(head.val);
//             }else if (head.val==st.peek()){
//                 st.pop();
//             }else {
//                 st.push(head.val);
//             }
//             head=head.next;
//         }
//         if(st.empty()){
//            return true;
//         }
//         return false;
        
        
         if (head == null || head.next == null) {
        return true;
    }
    
    // find the middle of the linked list
    ListNode slow = head;
    ListNode fast = head;
    while (fast.next != null && fast.next.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    
    // reverse the second half of the linked list
    ListNode prev = null;
    ListNode curr = slow.next;
    while (curr != null) {
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    slow.next = prev;
    
    // compare the first and second halves of the linked list
    ListNode p1 = head;
    ListNode p2 = prev;
    while (p2 != null) {
        if (p1.val != p2.val) {
            return false;
        }
        p1 = p1.next;
        p2 = p2.next;
    }
    return true;
}
}