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
    //  The idea is to traverse the two given linked lists simultaneously, using two pointers. When one pointer reaches the end of its list, it is reassigned to the head of the other list. This process continues until the two pointers meet, which indicates that they have reached the intersection point.
        //if l1 = m l2 = n length and common is c
        //then unique part is m-c and n-c 
        //by switching each list will travel m-c + c +n-c before reaching common 


        ListNode first = headA , second = headB;
        while(first!=null || second!= null ){
           if(first == second) return first;
           first = first.next;
           second = second.next;
           if(first == null && second!=null) first = headB;
           if(second == null && first!=null) second = headA;
           
         }
        return null;
    }
}