// Remove all elements from a linked list of integers that have value val.

// Example:

// Input:  1->2->6->3->4->5->6, val = 6
// Output: 1->2->3->4->5


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head==null || (head.next==null && head.val==val))
            return null;
        if(head.next==null && head.val!=val)
            return head;
        ListNode prev=head,current=prev.next;
        while (current!=null)
        {
            if (head.val ==val)
              { 
                  head=current;
                  prev=head;
                  current=prev.next;
              }
             else if(current.val==val)
                {
                    current=current.next;
                    prev.next=current;
                }
            else
            {
                prev=current;
                current=current.next;
            }
        }
        if (head.val==val) return null;
        return head;
        
    }
}