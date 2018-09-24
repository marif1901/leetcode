// Given a binary tree, determine if it is a valid binary search tree (BST).

// Assume a BST is defined as follows:

// The left subtree of a node contains only nodes with keys less than the node's key.
// The right subtree of a node contains only nodes with keys greater than the node's key.
// Both the left and right subtrees must also be binary search trees.
// Example 1:

// Input:
//     2
//    / \
//   1   3
// Output: true
// Example 2:

//     5
//    / \
//   1   4
//      / \
//     3   6
// Output: false
// Explanation: The input is: [5,1,4,null,null,3,6]. The root node's value
//              is 5 but its right child's value is 4.

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
    List<Integer> r=new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        if(root==null || (root.left==null &&root.right==null )) return true;
        /*inorder(root);
        Iterator itr=r.iterator();
        int a=(int)itr.next();
        while(itr.hasNext())
        {
            int b=(int)itr.next();
            if(a>=b) return false;
            a=b;
        }
        return true;*/
        return isValidBST(root,null,null);//In place with this function else inorder is fine
    }
        public boolean isValidBST(TreeNode root, TreeNode min, TreeNode max) {
        if(root==null) return true;
        if(min!=null && root.val<=min.val) return false;
        if(max!=null && root.val>=max.val) return false;
        if(!isValidBST(root.left, min, root)) return false;
        if(!isValidBST(root.right, root, max)) return false;
        return true;
    }
    public void inorder(TreeNode root)
    {
        if(root.left!=null) 
            inorder(root.left);
        r.add(root.val);
        if(root.right!=null)
            inorder(root.right);
        
    }
}