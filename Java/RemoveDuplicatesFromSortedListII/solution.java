// Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

// Example 1:

// Input: 1->2->3->3->4->4->5
// Output: 1->2->5
// Example 2:

// Input: 1->1->1->2->3
// Output: 2->3

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
        if(head==null || head.next==null) return head;
        int k=0;
        while(head.next!=null )
           {
              if (head.val==head.next.val)
               { 
                   head=head.next;k++;
               }
               else if (k==0) break;
               else if (head.next.next!=null )
                   {if(head.next.val==head.next.next.val) head= head.next;
                       else break;
                   }
               else
                    break;
           }
        if(k>0) head=head.next;
        if(head==null || head.next==null) return head;
        ListNode temp=head;
        ListNode temp1=temp.next;
        while(temp1!=null)
        {
            int h=0;
            while(temp1.next!=null)
            {
                if(temp1.val==temp1.next.val)
                    {
                        temp1=temp1.next;
                        temp.next=temp1;
                        h++;
                    }
                else break;
            }
            if (h>0)
            {
                temp1=temp1.next;
                temp.next=temp1;
            }
            if(h==0)
            {
                temp=temp1;
                temp1=temp1.next;
            }
        }
        return head;
    }
}