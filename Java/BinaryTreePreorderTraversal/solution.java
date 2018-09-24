// Given a binary tree, return the preorder traversal of its nodes' values.

// Example:

// Input: [1,null,2,3]
//    1
//     \
//      2
//     /
//    3

// Output: [1,2,3]


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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result =new ArrayList<>();
        addNode(root,result);
        return result;
    }
    public void addNode(TreeNode root,List<Integer> result)
    {
        if(root==null) return;
        result.add(root.val);
        if(root.left!=null)
            addNode(root.left,result);
        if(root.right!=null)
            addNode(root.right,result);
    }
}