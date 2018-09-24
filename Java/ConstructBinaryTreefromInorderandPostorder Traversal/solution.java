// Given inorder and postorder traversal of a tree, construct the binary tree.

// Note:
// You may assume that duplicates do not exist in the tree.

// For example, given

// inorder = [9,3,15,20,7]
// postorder = [9,15,7,20,3]
// Return the following binary tree:

//     3
//    / \
//   9  20
//     /  \
//    15   7

//    

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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        if(postorder.length==0) return null;
        return Build(0,0,inorder.length-1,postorder.length-1,postorder,inorder);
    }
    private TreeNode Build(int ps,int is,int ie,int pe,int []postorder,int[] inorder)
    {
        if(ps>pe || is>ie) return null;
        TreeNode root=new TreeNode(postorder[pe]);
        int rootIndex=0;
        for(int i=0;i<=ie;i++)
            if(inorder[i]==root.val)
               { rootIndex=i;break;}
        root.left=Build(ps,is,rootIndex-1,ps+rootIndex-is-1,postorder,inorder);
        root.right=Build(pe-ie+rootIndex,rootIndex+1,ie,pe-1,postorder,inorder);
        return root;
    }
}