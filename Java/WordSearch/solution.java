// Given a 2D board and a word, find if the word exists in the grid.

// The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.

// Example:

// board =
// [
//   ['A','B','C','E'],
//   ['S','F','C','S'],
//   ['A','D','E','E']
// ]

// Given word = "ABCCED", return true.
// Given word = "SEE", return true.
// Given word = "ABCB", return false.

public class Solution {
    public boolean exist(char[][] board, String word) {
              if(board.length == 0){
            return false;
        }
        if(board.length * board[0].length < word.length()){
            return false;
        }
        boolean[][] check = new boolean[board.length][board[0].length];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                //boolean[][] check = new boolean[board.length][board[0].length];
                if(search(board, check, word, 0, i, j)){
                    return true;
                }
            }
        }
        return false;
    }

    static boolean search(char[][] board,boolean[][] check, String s, int target, int row, int col){
        if(target >= s.length()){
            return true;
        }
        if(row < 0 || col < 0 || row >= board.length || col >= board[0].length){
            return false;
        }
        if(check[row][col]){
            return false;
        }
        if(board[row][col] != s.charAt(target)){
            return false;
        }
        check[row][col] = true;
        boolean result = search(board, check, s, target + 1, row + 1, col) || search(board, check, s, target + 1, row, col + 1)
                || search(board, check, s, target + 1, row - 1, col) || search(board, check, s, target + 1, row, col - 1);
        if(result == false){
            check[row][col] = false;
        }
        return result;
    }
}