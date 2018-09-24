// Given a 2D board containing 'X' and 'O' (the letter O), capture all regions surrounded by 'X'.

// A region is captured by flipping all 'O's into 'X's in that surrounded region.

// Example:

// X X X X
// X O O X
// X X O X
// X O X X
// After running your function, the board should be:

// X X X X
// X X X X
// X X X X
// X O X X
// Explanation:

// Surrounded regions shouldn’t be on the border, which means that any 'O' on the border of the board are not flipped to 'X'. Any 'O' that is not on the border and it is not connected to an 'O' on the border will be flipped to 'X'. Two cells are connected if they are adjacent cells connected horizontally or vertically.

public class Solution {
  public void solve(char[][] board) {
    if(board.length==0) return;
    for(int i=0;i<board[0].length;i++) helper(board,0,i);
    for(int i=1;i<board.length;i++) helper(board,i,board[0].length-1);
    for(int i=0;i<board[0].length-1;i++) helper(board,board.length-1,i);
    for(int i=1;i<board.length-1;i++) helper(board,i,0);
    for(int i =0;i<board.length;i++)
        for(int j=0;j<board[0].length;j++)
            board[i][j] = (board[i][j]=='M')?'O':'X';
    return;
}
public void helper(char[][] board, int a, int b){
    if(board[a][b]=='X'||board[a][b]=='M') return;
    board[a][b] = 'M';
    if(a+1<board.length) helper(board,a+1,b); 
    if(a-1>0) helper(board,a-1,b);
    if(b+1<board[0].length) helper(board,a,b+1);
    if(b-1>0) helper(board,a,b-1);
}
}