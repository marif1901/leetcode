// Reverse a singly linked list.

// Example:

// Input: 1->2->3->4->5->NULL
// Output: 5->4->3->2->1->NULL


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head==null || head.next==null )return head;
        ListNode prev=null,current=head,next=head.next;
        while(current!=null && next!=null)
        {
            current.next=prev;
            prev=current;
            current=next;
            next=current.next;
        }
        current.next=prev;
        return current;
       /* prev=head;current=head.next;next=current.next;
        while(next!=null)
        {
            current.next=prev;
            prev=current;
            current=next;
            next=current.next;
        }
        current.next =prev;
        head.next =null;
        return current;*/
        
    }
}