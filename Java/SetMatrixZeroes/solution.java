// Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in-place.

// Example 1:

// Input: 
// [
//   [1,1,1],
//   [1,0,1],
//   [1,1,1]
// ]
// Output: 
// [
//   [1,0,1],
//   [0,0,0],
//   [1,0,1]
// ]
// Example 2:

// Input: 
// [
//   [0,1,2,0],
//   [3,4,5,2],
//   [1,3,1,5]
// ]
// Output: 
// [
//   [0,0,0,0],
//   [0,4,5,0],
//   [0,3,1,0]
// ]
// Follow up:

// A straight forward solution using O(mn) space is probably a bad idea.
// A simple improvement uses O(m + n) space, but still not the best solution.
// Could you devise a constant space solution?

public class Solution {
    public void setZeroes(int[][] m) {
        int r=m.length;
        int c=m[0].length;
        boolean fc=false,fr=false;
        for (int i=0;i<r;i++)
        {
            for (int j=0;j<c;j++)
            {
                if(m[i][j]==0)
                {
                   if(i==0) fr=true;
                   if(j==0) fc=true;
                   m[0][j]=0;
                   m[i][0]=0;
                }
            }
        }
        for (int i=1;i<r;i++)
        {
            for (int j=1;j<c;j++)
            {
                if(m[0][j]==0 || m[i][0]==0)
                {
                    m[i][j]=0;
                }
                    
            }
        }
        if(fr)
            for(int k=0;k<c;k++)
                m[0][k]=0;
        if(fc)
            for(int k=0;k<r;k++)
                m[k][0]=0;
    }
}