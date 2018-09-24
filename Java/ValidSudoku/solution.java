// Determine if a 9x9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

// Each row must contain the digits 1-9 without repetition.
// Each column must contain the digits 1-9 without repetition.
// Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 without repetition.

// The Sudoku board could be partially filled, where empty cells are filled with the character '.'.

// Example 1:

// Input:
// [
//   ["5","3",".",".","7",".",".",".","."],
//   ["6",".",".","1","9","5",".",".","."],
//   [".","9","8",".",".",".",".","6","."],
//   ["8",".",".",".","6",".",".",".","3"],
//   ["4",".",".","8",".","3",".",".","1"],
//   ["7",".",".",".","2",".",".",".","6"],
//   [".","6",".",".",".",".","2","8","."],
//   [".",".",".","4","1","9",".",".","5"],
//   [".",".",".",".","8",".",".","7","9"]
// ]
// Output: true
// Example 2:

// Input:
// [
//   ["8","3",".",".","7",".",".",".","."],
//   ["6",".",".","1","9","5",".",".","."],
//   [".","9","8",".",".",".",".","6","."],
//   ["8",".",".",".","6",".",".",".","3"],
//   ["4",".",".","8",".","3",".",".","1"],
//   ["7",".",".",".","2",".",".",".","6"],
//   [".","6",".",".",".",".","2","8","."],
//   [".",".",".","4","1","9",".",".","5"],
//   [".",".",".",".","8",".",".","7","9"]
// ]
// Output: false
// Explanation: Same as Example 1, except with the 5 in the top left corner being 
//     modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is invalid.
// Note:

// A Sudoku board (partially filled) could be valid but is not necessarily solvable.
// Only the filled cells need to be validated according to the mentioned rules.
// The given board contain only digits 1-9 and the character '.'.
// The given board size is always 9x9.


public class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> set = new HashSet<Character>();
    //horizontal and vertical judging
    for (int i=0; i<9; i++) {
        set.clear();
        for (int j=0; j<9; j++) {
            char location = board[i][j];
            if (location == '.') continue;
            if (set.contains(location)) return false;
            set.add(location);
        }
    }
    for (int i=0; i<9; i++) {
        set.clear();
        for (int j=0; j<9; j++) {
            char location = board[j][i];
            if (location == '.') continue;
            if (set.contains(location)) return false;
            set.add(location);
        }
    }
    //3*3 judging
    for (int m=0; m<3; m++) {
        for (int n=0; n<3; n++) {
            set.clear();

            for (int i=m*3; i<m*3+3; i++) {
                for (int j=n*3; j<n*3+3; j++) {
                    char location = board[i][j];
                    if (location == '.') continue;
                    if (set.contains(location)) return false;
                    set.add(location);
                }
            }
        }
    }
    return true;
        
        
    }
}




