// The n-queens puzzle is the problem of placing n queens on an n×n chessboard such that no two queens attack each other.
// Given an integer n, return all distinct solutions to the n-queens puzzle.

// Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space respectively.

// Example:

// Input: 4
// Output: [
//  [".Q..",  // Solution 1
//   "...Q",
//   "Q...",
//   "..Q."],

//  ["..Q.",  // Solution 2
//   "Q...",
//   "...Q",
//   ".Q.."]
// ]
// Explanation: There exist two distinct solutions to the 4-queens puzzle as shown above.

public class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result=new ArrayList<List<String>>();
        int [] x=new int [n+1];
        PlaceQueen(1,n,x,result);
        return result;
    }
    public void PlaceQueen(int k,int n,int [] x,List<List<String>> result)
    {
        for(int i=1;i<=n;i++)
        {
            if (IsSafe(k,i,x))
            {
                x[k]=i;
                if(k==n)
                {
                    List<String> temp=new ArrayList<String>();
                    for(int j=1;j<=k;j++)
                    {
                        String s="";
                        for(int h=1;h<=n;h++)
                            {
                                if (h==x[j])
                                    s=s+'Q';
                                else
                                    s=s+'.';
                            }
                            temp.add(s);
                    }
                    result.add(temp);
                }
                else
                    PlaceQueen(k+1,n,x,result);
            }
        }
    }
    public boolean IsSafe(int k,int i,int[] x)
    {
        for (int g=1;g<k;g++)
        {
            if(x[g]==i || Math.abs(k-g)==Math.abs(x[g]-i))
                return false;
        }
        return true;
    }
}