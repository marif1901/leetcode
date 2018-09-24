// Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

// For example:
// Given binary tree [3,9,20,null,null,15,7],
//     3
//    / \
//   9  20
//     /  \
//    15   7
// return its level order traversal as:
// [
//   [3],
//   [9,20],
//   [15,7]
// ]

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
    List<List<Integer>>  result= new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) 
    {
        if(root==null) return result;
        AddLevel(root,0);
        return result;
    }
    public void AddLevel(TreeNode root,int level)
    {
        if(root==null) return ;
        if(level==result.size())
            result.add(new ArrayList<>());
        result.get(level).add(root.val);
        AddLevel(root.left,level+1);
        AddLevel(root.right,level+1);
    }
}