// Given a binary tree, determine if it is height-balanced.

// For this problem, a height-balanced binary tree is defined as:

// a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

// Example 1:

// Given the following tree [3,9,20,null,null,15,7]:

//     3
//    / \
//   9  20
//     /  \
//    15   7
// Return true.

// Example 2:

// Given the following tree [1,2,2,3,3,null,null,4,4]:

//        1
//       / \
//      2   2
//     / \
//    3   3
//   / \
//  4   4
// Return false.

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
    private boolean balanced = true;
    public boolean isBalanced(TreeNode root) {
        findDepth(root, 1);
        return balanced;
    }

   private int findDepth(TreeNode node, int level){
        if (!balanced || node == null){
            return level-1;
        }
        int depthL = findDepth(node.left, level+1);
        int depthR = findDepth(node.right, level+1);
        int max = Math.max(depthL, depthR);
        int min = Math.min(depthL, depthR);
        if (max-min > 1){
            balanced = false;
        }
        return max;
    }
}
