/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    
    ListNode *detectCycle(ListNode *head) {
    //  ListNode* meet=cycle(head);  
        ListNode *meet=NULL,*fast=head,*slow=head;
        while(fast && fast->next)
        {
            slow=slow->next;
            fast=fast->next->next;
            if(fast==slow)
            { meet=slow;
              break;
            }
        }
       // return head;
        if(meet!=NULL)
        while(head!=meet)
        {
            head=head->next;
            meet=meet->next;
        }
        return meet;
    }
};