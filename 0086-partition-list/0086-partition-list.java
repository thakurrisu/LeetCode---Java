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
    public ListNode partition(ListNode head, int x) {
       ListNode dummy = new ListNode(-1);
       ListNode less = dummy, more= null ,firstMore = null ,itr = head;
       dummy.next = head;
       while(itr!=null)
       {
        if(itr.val<x)
        {
                less.next = itr;
                //if(dummy.next == head) dummy.next= itr;
                less = less.next;
        }
        else
        {
           
            
             if(more == null) { firstMore = itr; more = itr;}
             else 
             {more.next = itr;
            more = more.next;
             }
        }
        itr = itr.next;
       } 
       less.next = firstMore;
       if(more!=null)
       more.next=null;
       return dummy.next;
    }
}