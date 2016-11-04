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
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        int a[] = new int[n];
        backtrack(n,a,0,res);
        return res;
    }
    public void backtrack(int n,int[] a,int i,List<List<String>> res){
        if (i == n){
            res.add(getList(a,n));
            return;
        }
        for (int j = 1; j <= n; j++) {
            a[i]=j;
            if (!isConflict(a,i)){
                backtrack(n,a,i+1,res);
                a[i]=0;
            }
        }
    }
    public List<String> getList(int a[],int n){
        List<String> temp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 1; j <= n; j++) {
                if (a[i]==j){
                    sb.append('Q');
                }else
                    sb.append('.');
            }
            temp.add(sb.toString());
        }
        return temp;
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
        List<List<String>> res=solution.solveNQueens(5);
        for (List<String> l:res)
            System.out.println(l);
    }
}


