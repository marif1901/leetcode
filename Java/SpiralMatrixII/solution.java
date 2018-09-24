// Given a positive integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

// Example:

// Input: 3
// Output:
// [
//  [ 1, 2, 3 ],
//  [ 8, 9, 4 ],
//  [ 7, 6, 5 ]
// ]

public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result=new int [n][n];
        if(n==0) return result;
       // if(n==1) {result[0][0]=1;return result;}
        int row=0,k=1;
        while(row<=(n-1)/2 )
        {
            for(int i=row;i<n-row;i++)
            {
                result[row][i]=k;
                k++;
            }
            for(int i=row+1;i<n-row;i++)
            {
                result[i][n-1-row]=k;
                k++;
            }
            for(int i=n-row-2;i>=row;i--)
            {
                result[n-row-1][i]=k;
                k++;
            }
            for(int i=n-row-2;i>row;i--)
            {
                result[i][row]=k;
                k++;
            }
            row++;
        }
        return result;
    }
}