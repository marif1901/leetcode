// Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

// Example 1:

// Input:
// 11110
// 11010
// 11000
// 00000

// Output: 1
// Example 2:

// Input:
// 11000
// 11000
// 00100
// 00011

// Output: 3


public class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        if (n==0) return 0;
        int count=0;
        int m =grid[0].length;
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='1')
                {
                    count++;
                    MarkVisit(grid,i,j);
                }
            }
            return count;
    }
    // mark the visited ones by 0 ,4 direction for any point
    private void MarkVisit(char [][] grid,int i ,int j)
    {
        if(i<0 || i> grid.length-1 || j<0 || j> grid[0].length-1 || grid[i][j]!='1') return;
        grid[i][j]='0';
        MarkVisit(grid,i+1,j);
        MarkVisit(grid,i-1,j);
        MarkVisit(grid,i,j+1);
        MarkVisit(grid,i,j-1);
    }
}