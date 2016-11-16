
/**
 Given a 2D board and a word, find if the word exists in the grid.

 The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.

 For example,
 Given board =

 [
 ['A','B','C','E'],
 ['S','F','C','S'],
 ['A','D','E','E']
 ]
 word = "ABCCED", -> returns true,
 word = "SEE", -> returns true,
 word = "ABCB", -> returns false.
 */
public class Solution {
    public boolean exist(char[][] board, String word) {
        if (board==null || board.length==0 || word==null || word.length()==0) return false;
        int row = board.length;
        int col = board[0].length;
        boolean res=false;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (word.charAt(0) == board[i][j]){
                    if (backtracking(board,word,0,i,j))
                        return true;
                }
            }
        }
        return res;
    }
    public boolean backtracking(char[][] board,String word,int k,int row,int col){
        if (k == word.length())
            return true;
        if (row<0 || row>=board.length || col<0 || col>=board[0].length)
            return false;
        if (board[row][col] != word.charAt(k))
            return false;
        board[row][col] = '*';
        boolean result = backtracking(board,word,k+1,row+1,col)
                || backtracking(board,word,k+1,row-1,col)
                || backtracking(board,word,k+1,row,col-1)
                ||backtracking(board,word,k+1,row,col+1);
        board[row][col] = word.charAt(k);
        return result;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        char a[][] = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        System.out.println(solution.exist(a,"ADEE"));
    }
}


