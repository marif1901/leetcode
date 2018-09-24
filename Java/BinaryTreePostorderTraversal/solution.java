// Given a binary tree, return the postorder traversal of its nodes' values.

// Example:

// Input: [1,null,2,3]
//    1
//     \
//      2
//     /
//    3

// Output: [3,2,1]

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
    
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<Integer>();
        if (root==null) return result;
        addNode(root,result);
        return result;
    }
    public void addNode(TreeNode root,List<Integer> result)
    {
        if (root==null) return ;
        if (root.left!=null)
            addNode(root.left,result);
        if(root.right!=null)
            addNode(root.right,result);
        result.add(root.val);
        
    }
}
