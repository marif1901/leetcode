// Reverse a linked list from position m to n. Do it in one-pass.

// Note: 1 ≤ m ≤ n ≤ length of list.

// Example:

// Input: 1->2->3->4->5->NULL, m = 2, n = 4
// Output: 1->4->3->2->5->NULL

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        /* solution 1 
        if(head==null || head.next==null) return head;
        if(m==n) return head;
        ListNode prev =null,temp1=head;
        for(int i=1;i<m;i++)
        {
            prev=temp1;
            temp1=temp1.next;
        }
        ListNode temp2=temp1.next;
        for(int j=1;j<n-m;j++)
        {
            temp2=temp2.next;
        }
        ListNode end=temp2.next;
        ListNode prev1=end,current=temp1,next=temp1.next;
        while(current!=null && next!=null)
        {
            current.next=prev1;
            prev1=current;
            current=next;
            next=current.next;
        }
        current.next=prev1;
        if(m==1) return current;
        prev.next=current;
        
        return head;*/
        
        /* solution 2 */
        
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode pre=dummy; //pre is the node before orignal M
        ListNode M=head;    //M is after pre

        for(int i=1;i<m;i++){ //Move pre and M to orignal place
            pre=pre.next;
            M=M.next;
        }

        for(int i=0;i<n-m;i++){ 
            ListNode current=M.next; //Both pre and M are all fixed, only current is assigned every time to M.next. M is pushed back everytime
            M.next=current.next;     //Move current to the position after pre
            current.next=pre.next;
            pre.next=current;
        }

        return dummy.next;
    }
}