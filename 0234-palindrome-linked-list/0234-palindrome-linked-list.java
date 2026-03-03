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
        ListNode slow = head;
        ListNode fast = head;
        Stack<Integer> st = new Stack<Integer>();
        while(slow!=null){
            st.push(slow.val);
            slow = slow.next;
           // fast = fast.next.next;
        }
       
        while(fast!=null){
            int data = st.pop();
            if(fast.val!=data) return false;
            fast=fast.next;
        }
        return true;

    }
}