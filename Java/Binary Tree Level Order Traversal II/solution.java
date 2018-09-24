// Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

// For example:
// Given binary tree [3,9,20,null,null,15,7],
//     3
//    / \
//   9  20
//     /  \
//    15   7
// return its bottom-up level order traversal as:
// [
//   [15,7],
//   [9,20],
//   [3]
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
    List<List<Integer>> ret= new  ArrayList<>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
    if(root==null)
        return ret;
    recursive(root,0);
    return ret;

}

    public void recursive(TreeNode root,int level){
        if(root==null)
            return;
        if(level>=ret.size())
            ret.add(0,new ArrayList());
        ret.get(ret.size()-level-1).add(root.val);
        recursive(root.left,level+1);
        recursive(root.right,level+1);
    }
}