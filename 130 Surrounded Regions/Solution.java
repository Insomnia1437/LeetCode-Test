

/**
 Given a 2D board containing 'X' and 'O' (the letter O), capture all regions surrounded by 'X'.

 A region is captured by flipping all 'O's into 'X's in that surrounded region.

 For example,
 X X X X
 X O O X
 X X O X
 X O X X
 After running your function, the board should be:

 X X X X
 X X X X
 X X X X
 X O X X
 **
 */
public class Solution {
    public void solve(char[][] board) {
        int row = board.length;
        if(row <= 1) return;
        int col = board[0].length;

        for (int i = 0; i < row; i++) {
            check(board,i,0,row,col);
            if (col>1) check(board,i,col-1,row,col);
        }
        for (int j = 0; j < col; j++) {
            check(board,0,j,row,col);
            if (row>1) check(board,row-1,j,row,col);
        }



        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == '1') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    public void check(char[][] board,int i,int j,int row,int col) {
        if (board[i][j] == 'O') {
            board[i][j]='1';
            if (i>1) check(board,i-1,j,row,col);
            if (j>1) check(board,i,j-1,row,col);
            if (i+1<row) check(board,i+1,j,row,col);
            if (j+1<col) check(board,i,j+1,row,col);
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();

    }
}


