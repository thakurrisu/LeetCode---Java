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
    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next =curr;
        while(curr!=null){
            next= curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
    
      //find mid
        while(fast!= null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

       ListNode rev = reverse(slow.next);
       slow.next = null;
       while(rev!=null){
        if(head.val != rev.val)
        return false;
        head = head.next;
        rev = rev.next;
       }     
       return true;
        // while(fast!=null){
        //     int data = st.pop();
        //     if(fast.val!=data) return false;
        //     fast=fast.next;
        // }
        // return true;

    }
}