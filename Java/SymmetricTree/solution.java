// Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

// For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

//     1
//    / \
//   2   2
//  / \ / \
// 3  4 4  3
// But the following [1,2,2,null,3,null,3] is not:
//     1
//    / \
//   2   2
//    \   \
//    3    3
// Note:
// Bonus points if you could solve it both recursively and iteratively.

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
    public boolean isSymmetric(TreeNode root) {
        if (root==null )
            return true;
         if( root.left ==null && root.right ==null)
            return true;
        if ((root.left ==null || root .right ==null) )
            return false;
        else 
            return checkchilds(root.left,root.right);
    }
    public boolean checkchilds(TreeNode l ,TreeNode r)
    {
        if (l==null && r== null)
            return true;
        if (l==null || r==null )
            return false;
        else
           { if (l.val==r.val)
                return (checkchilds(l.left,r.right) && checkchilds(l.right,r.left) );
            else 
                return false;
           }
    }
}