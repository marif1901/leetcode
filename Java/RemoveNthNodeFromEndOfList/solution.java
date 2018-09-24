Given a linked list, remove the n-th node from the end of list and return its head.

Example:

Given linked list: 1->2->3->4->5, and n = 2.

After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:

Given n will always be valid.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (n<=0 || head ==null ) return head;
        ListNode tmp=null,run=head;
        while(run!=null)
        {
            tmp=(tmp==null)? null :tmp.next;
            if (n==0) 
                tmp=head;
            n--;
            run=run.next;
        }
        if(tmp!=null)
            tmp.next=tmp.next.next;
        else if(n==0)
            head=head.next;
        return head;
        
    }
}
