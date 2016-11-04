import java.util.ArrayList;
import java.util.List;

/**
 The n-queens puzzle is the problem of placing n queens on an n×n chessboard such that no two queens attack each other.



 Given an integer n, return all distinct solutions to the n-queens puzzle.

 Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space respectively.

 For example,
 There exist two distinct solutions to the 4-queens puzzle:

 [
 [".Q..",  // Solution 1
 "...Q",
 "Q...",
 "..Q."],

 ["..Q.",  // Solution 2
 "Q...",
 "...Q",
 ".Q.."]
 ]

 */
public class Solution {
    int count=0;
    public int totalNQueens(int n) {
        int a[] = new int[n];
        backtrack(n,a,0);
        return count;
    }
    public void backtrack(int n,int[] a,int i){
        if (i == n){
            count++;
            return;
        }
        for (int j = 1; j <= n; j++) {
            a[i]=j;
            if (!isConflict(a,i)){
                backtrack(n,a,i+1);
                a[i]=0;
            }
        }
    }
    public boolean isConflict(int a[],int i){
        if (i==0)return false;
        for (int j = 0; j < i; j++) {
            if (a[j] == a[i] || Math.abs(a[j]-a[i])==Math.abs(i-j)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int res=solution.totalNQueens(8);
        System.out.println(res);

    }
}


