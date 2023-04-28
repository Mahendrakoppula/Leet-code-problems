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
          ArrayList<Integer> al= new ArrayList<>();

        while(head!=null){
            al.add(head.val);
            head=head.next;
        }
        System.out.println(al);
        int n=al.size();
        for (int i = 0; i < n/2; i++) {
            if(al.get(i)!=al.get(n-i-1)){
                return false;
            }
    }
 return true;       
}
}