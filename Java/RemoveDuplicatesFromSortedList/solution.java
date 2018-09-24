// Given a sorted linked list, delete all duplicates such that each element appear only once.

// Example 1:

// Input: 1->1->2
// Output: 1->2
// Example 2:

// Input: 1->1->2->3->3
// Output: 1->2->3


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null )
            return head;
        ListNode temp =head;
        ListNode current=head.next;
        while(current!=null)
        {
            if(temp.val==current.val)
               {
                   temp.next =current.next;
                   current=current.next;
               }
           else
           {
               temp=temp.next;
               current=current.next;
           }
        }
        return head;
        
    }
}