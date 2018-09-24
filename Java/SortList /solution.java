// Sort a linked list in O(n log n) time using constant space complexity.

// Example 1:

// Input: 4->2->1->3
// Output: 1->2->3->4
// Example 2:

// Input: -1->5->3->4->0
// Output: -1->0->3->4->5

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        if(head ==null || head.next==null) return head;
        ListNode back=head,front=head,p=null;
        while(front!=null && front.next!=null)
        {
            p=back;
            back=back.next;
            front=front.next.next;
        }
        p.next=null;
        ListNode l1=sortList(head);
        ListNode l2=sortList(back);
        return Merge(l1,l2);
    }
    private ListNode Merge (ListNode l1,ListNode l2)
    {
        ListNode l=new ListNode(0),p=l;
        while(l1!=null && l2!=null)
        {
            if(l1.val<l2.val)
            {
                p.next=l1;
                l1=l1.next;
            }
            else
            {
                p.next=l2;
                l2=l2.next;
            }
            p=p.next;
        }
        if(l1==null)
            p.next=l2;
        else
            p.next=l1;
        return l.next;
    }
}