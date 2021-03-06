// Write a program to find the node at which the intersection of two singly linked lists begins.


// For example, the following two linked lists:

// A:          a1 → a2
//                    ↘
//                      c1 → c2 → c3
//                    ↗            
// B:     b1 → b2 → b3
// begin to intersect at node c1.


// Notes:

// If the two linked lists have no intersection at all, return null.
// The linked lists must retain their original structure after the function returns.
// You may assume there are no cycles anywhere in the entire linked structure.
// Your code should preferably run in O(n) time and use only O(1) memory.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

    if(headA == null || headB == null){
        return null;
    }

    int lenA = 0;
    int lenB = 0;
    ListNode lenforA = headA;
    ListNode lenforB = headB;

    while(lenforA != null){
        lenforA = lenforA.next;
        lenA++;
    }
    while(lenforB != null){
        lenforB = lenforB.next;
        lenB++;
    }

    if(lenA > lenB){
        int move1 = lenA - lenB;
        while(move1 != 0){
            headA = headA.next;
            move1--;
        }
    }

    if(lenA < lenB){
        int move2 = lenB - lenA;
        while(move2 != 0){
            headB = headB.next;
            move2--;
        }
    }

    while(headA != null && headB != null){
        if(headA == headB){
            return headA;
        }
        headA = headA.next;
        headB = headB.next;
    }

    return null;
}
}