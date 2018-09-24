// A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

// The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

// Now consider if some obstacles are added to the grids. How many unique paths would there be?

// An obstacle and empty space is marked as 1 and 0 respectively in the grid.

// Note: m and n will be at most 100.

// Example 1:

// Input:
// [
//   [0,0,0],
//   [0,1,0],
//   [0,0,0]
// ]
// Output: 2
// Explanation:
// There is one obstacle in the middle of the 3x3 grid above.
// There are two ways to reach the bottom-right corner:
// 1. Right -> Right -> Down -> Down
// 2. Down -> Down -> Right -> Right

public class Solution {
    public int uniquePathsWithObstacles(int[][] br) 
    {
        if(br[0][0]==1)return 0;
         int [][]ar=new int [br.length][br[0].length];
         int m=br.length;
         int n=br[0].length;
        for(int i=0;i<m;i++)
        {
            if(br[i][0]!=1)ar[i][0]=1;
            else break;
        }

        for(int i=0;i<n;i++)
        {
           if(br[0][i]!=1) ar[0][i]=1;
            else break;  
        }

        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(br[i][j]!=1)
                {
                    ar[i][j]=ar[i][j-1]+ar[i-1][j];
                }
            }
        }
        return ar[br.length-1][br[0].length-1];
    }
}
  

