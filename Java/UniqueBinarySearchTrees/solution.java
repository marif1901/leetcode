// Given n, how many structurally unique BST's (binary search trees) that store values 1 ... n?

// Example:

// Input: 3
// Output: 5
// Explanation:
// Given n = 3, there are a total of 5 unique BST's:

//    1         3     3      2      1
//     \       /     /      / \      \
//      3     2     1      1   3      2
//     /     /       \                 \
//    2     1         2                 3

public class Solution {
    public int numTrees(int n) 
    {
        if(n<=1) return 1;
        if(n==2)return 2;
        int []c=new int [n+1];
        c[0]=1;
        c[1]=1;
        for(int i=2;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                c[i]+=c[j-1]*c[i-j];
            }
        }
        return c[n];
    }
}