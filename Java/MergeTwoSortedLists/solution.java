// Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

// Example:

// Input: 1->2->4, 1->3->4
// Output: 1->1->2->3->4->4

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null || l2==null)
        {
            return l1==null? l2:l1;
        }
        
        ListNode result= l1.val<l2.val ? l1:l2;
        ListNode temp1=l1,temp2=l2,head;
        head=result;
        if(l1.val<l2.val ) 
             temp1=temp1.next;
        else
             temp2=temp2.next;
        while(temp1!=null && temp2!=null)
        {
            if(temp1.val <= temp2.val)
               {
                   result.next=temp1;
                   result=result.next;
                   temp1=temp1.next;
                   
               }
               else
               {
                   result.next =temp2;
                   result=result.next;
                   temp2=temp2.next;
               }
        }
        if (temp1==null)
        {
            while(temp2!=null)
            {
                result.next=temp2;
                result=result.next;
                temp2=temp2.next;
            }
            
        }
        else
            while(temp1!=null)
            {
                result.next=temp1;
                result=result.next;
                temp1=temp1.next;
            }
        return head;
        
    }
}