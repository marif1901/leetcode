// The n-queens puzzle is the problem of placing n queens on an n×n chessboard such that no two queens attack each other.
// Given an integer n, return the number of distinct solutions to the n-queens puzzle.

// Example:

// Input: 4
// Output: 2
// Explanation: There are two distinct solutions to the 4-queens puzzle as shown below.
// [
//  [".Q..",  // Solution 1
//   "...Q",
//   "Q...",
//   "..Q."],

//  ["..Q.",  // Solution 2
//   "Q...",
//   "...Q",
//   ".Q.."]
// ]

public class Solution {
    public int totalNQueens(int n) {
        int [] x=new int[n+1];
        int count[]=new int[1];
        PlaceQueen(1,n,x,count);
        return count[0];
    }
    public void PlaceQueen(int k,int n,int[] x,int[] count)
    {
        for(int i=1;i<=n;i++)
        {
            if(IsSafe(k,i,x))
            {
                x[k]=i;
                if (k==n)
                     count[0]++;
                else
                   PlaceQueen(k+1,n,x,count);
            }
        }
    }
    public boolean IsSafe(int k,int i,int[] x)
    {
        for (int g=1;g<k;g++)
        {
            if (x[g]==i || Math.abs(k-g)==Math.abs(x[g]-i))
            return false;
        }
        return true;
    }
}