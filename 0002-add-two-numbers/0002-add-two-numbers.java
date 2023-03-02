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
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//     int carry = 0;
//     ListNode dummy = new ListNode(0);
//     ListNode curr = dummy;

//     while (l1 != null || l2 != null) {
//         int x = (l1 != null) ? l1.val : 0;
//         int y = (l2 != null) ? l2.val : 0;
//         int sum = x + y + carry;
//         carry = sum / 10;
//         curr.next = new ListNode(sum % 10);
//         curr = curr.next;
//         if (l1 != null) l1 = l1.next;
//         if (l2 != null) l2 = l2.next;
//     }

//     if (carry > 0) {
//         curr.next = new ListNode(carry);
//     }

//     return dummy.next;
// }
    
   public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode result = null;
    ListNode curr = null;
    int sum = 0;
    
    // Calculate the sum of the digits in reverse order
    while (l1 != null || l2 != null || sum > 0) {
        if (l1 != null) {
            sum += l1.val;
            l1 = l1.next;
        }
        if (l2 != null) {
            sum += l2.val;
            l2 = l2.next;
        }
        if (result == null) {
            result = new ListNode(sum % 10);
            curr = result;
        } else {
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
        }
        sum /= 10;
    }
    
    return result;
}


}