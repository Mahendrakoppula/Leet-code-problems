/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    // ListNode a= headA;
    //     while(a!=null){
    //         ListNode b= headB;
    //         while(b!=null){
    //             if(a==b){
    //                 return a;
    //             }
    //             b=b.next;
    //         }
    //          a=a.next;
    //     }
    //     return null;
        
    int lenA = getLength(headA);
    int lenB = getLength(headB);
    ListNode A = headA, B = headB;
    
    while (lenA > lenB) {
        A = A.next;
        lenA--;
    }
    while (lenB > lenA) {
        B = B.next;
        lenB--;
    }
    
    while (A != null && B != null) {
        if (A == B) {
            return A;
        }
        A = A.next;
        B = B.next;
    }
    return null;
}
    private int getLength(ListNode node) {
    int len = 0;
    while (node != null) {
        len++;
        node = node.next;
    }
    return len;
        
//         Set<ListNode> st= new HashSet<>();
        
//         ListNode a=headA;
//         while(a!=null){
//             st.add(a);
//             a=a.next;
//         }
        
//         ListNode b=headB;
//         while(b!=null){
//            if(st.contains(b)){
//                return b;
//            }
//             b=b.next;
//         }
//         return null;
    }
}