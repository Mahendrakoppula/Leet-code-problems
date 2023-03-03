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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    // Get the lengths of the two linked lists
    int len1 = getLength(l1);
    int len2 = getLength(l2);
    
    // Reverse the two linked lists
    l1 = reverse(l1);
    l2 = reverse(l2);
    
    // Add the two linked lists
    ListNode result = null;
    int carry = 0;
    while (l1 != null || l2 != null || carry != 0) {
        int val1 = l1 != null ? l1.val : 0;
        int val2 = l2 != null ? l2.val : 0;
        int sum = val1 + val2 + carry;
        carry = sum / 10;
        sum = sum % 10;
        ListNode node = new ListNode(sum);
        node.next = result;
        result = node;
        if (l1 != null) {
            l1 = l1.next;
        }
        if (l2 != null) {
            l2 = l2.next;
        }
    }
    
    return result;
}

private int getLength(ListNode head) {
    int len = 0;
    while (head != null) {
        len++;
        head = head.next;
    }
    return len;
}

private ListNode reverse(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;
    while (curr != null) {
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    return prev;
}

}