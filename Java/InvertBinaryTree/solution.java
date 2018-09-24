// Invert a binary tree.

// Example:

// Input:

//      4
//    /   \
//   2     7
//  / \   / \
// 1   3 6   9
// Output:

//      4
//    /   \
//   7     2
//  / \   / \
// 9   6 3   1


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
    public TreeNode invertTree(TreeNode root) {
        if (root==null)
            return root;
        if(root.left!=null|| root.right!=null) 
            swap(root);
        return root;
        
    }
    public void swap(TreeNode root)
    {
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        if (root.left!=null && (root.left.left!=null || root.left.right!=null))
            swap(root.left);
        if (root.right!=null && (root.right.left!=null || root.right.right!=null))
            swap(root.right);
            
        
    }
}