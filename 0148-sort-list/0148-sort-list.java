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
    public ListNode sortList(ListNode head) {
//         if (head == null || head.next == null) {
//             return head;
//         }
        
//         ListNode middle = getMiddle(head);
//         ListNode nextToMiddle = middle.next;
//         middle.next = null;
        
//         ListNode left = sortList(head);
//         ListNode right = sortList(nextToMiddle);
        
//         return merge(left, right);
//     }
    
//     public ListNode merge(ListNode left, ListNode right) {
//         ListNode result = new ListNode(0);
//         ListNode current = result;
        
//         while (left != null && right != null) {
//             if (left.val < right.val) {
//                 current.next = left;
//                 left = left.next;
//             } else {
//                 current.next = right;
//                 right = right.next;
//             }
//             current = current.next;
//         }
        
//         if (left != null) {
//             current.next = left;
//         }
//         if (right != null) {
//             current.next = right;
//         }
        
//         return result.next;
//     }
    
//     public ListNode getMiddle(ListNode head) {
//         if (head == null) {
//             return head;
//         }
        
//         ListNode slow = head;
//         ListNode fast = head.next;
        
//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }
        
//         return slow;
        
        
        if (head == null || head.next == null) {
        return head;
    }
    
    // Split the list into two halves
    ListNode left = head;
    ListNode right = null;
    ListNode current = head;
    int size = 0;
    while (current != null) {
        current = current.next;
        size++;
    }
    int halfSize = size / 2;
    current = head;
    for (int i = 0; i < halfSize; i++) {
        ListNode next = current.next;
        if (i == halfSize - 1) {
            current.next = null;
            right = next;
        }
        current = next;
    }
    
    // Recursively sort the two halves
    left = sortList(left);
    right = sortList(right);
    
    // Merge the sorted halves
    ListNode result = null;
    ListNode tail = null;
    while (left != null && right != null) {
        ListNode node;
        if (left.val < right.val) {
            node = left;
            left = left.next;
        } else {
            node = right;
            right = right.next;
        }
        if (result == null) {
            result = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }
    if (left != null) {
        tail.next = left;
    }
    if (right != null) {
        tail.next = right;
    }
    
    return result;
    }
}