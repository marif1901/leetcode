// You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

// You may assume the two numbers do not contain any leading zero, except the number 0 itself.

// Example:

// Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
// Output: 7 -> 0 -> 8
// Explanation: 342 + 465 = 807.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Solution {
    int sum = 0;
int carry = 0;
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    if(l1 == null && l2 == null){
        if(carry == 0) return null;
        return new ListNode(1);
    }else{
        sum = (l1 == null ? 0:l1.val) + (l2 == null ? 0:l2.val) + carry;
        carry = sum / 10;
        sum = sum % 10;
    }

    ListNode newNode = new ListNode(sum);
    newNode.next = addTwoNumbers(l1 == null?null:l1.next, l2 == null? null:l2.next);
    return newNode;
}
}
