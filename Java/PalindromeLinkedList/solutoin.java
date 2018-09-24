// Given a singly linked list, determine if it is a palindrome.

// Example 1:

// Input: 1->2
// Output: false
// Example 2:

// Input: 1->2->2->1
// Output: true


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    ListNode start;
    public boolean isPalindrome(ListNode head) {
        if (head==null || head.next==null)  return true;
        start =head;
        return check(head);
    }
    public boolean check(ListNode head)
    {
        boolean flag= true;
        if(head.next!=null) flag= check(head.next);
        if(flag && head.val==start.val)
           { start=start.next;
            return true;}
        return false;
    }
}