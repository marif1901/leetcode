// Given a singly linked list where elements are sorted in ascending order, convert it to a height balanced BST.

// For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

// Example:

// Given the sorted linked list: [-10,-3,0,5,9],

// One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:

//       0
//      / \
//    -3   9
//    /   /
//  -10  5

//  

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    //Though we know the fact that inorder(sorted list/array) doesnt give a unique BST we are just taking a case(root as the middle) and solving
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null ) return null;
        ListNode back=head,front=head,temp=null;
        while(front !=null && front.next!=null)
        {
            temp=back;
            back=back.next;
            front=front.next.next;
        }
        if(temp!=null)
            temp.next=null;
        else
            head=null;
        TreeNode root=new TreeNode(back.val);
        root.left= sortedListToBST(head);
        root.right=sortedListToBST(back.next);
        return root;
       
    }
}