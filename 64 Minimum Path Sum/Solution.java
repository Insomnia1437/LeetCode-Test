
/**
 Given a m x n grid filled with non-negative numbers,
 find a path from top left to bottom right which minimizes the sum of all numbers along its path.

 Note: You can only move either down or right at any point in time.
 */
public class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        int dp[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0 && j==0) {dp[i][j]=grid[i][j];continue;}
                if (i==0) {dp[i][j] = grid[i][j]+dp[i][j-1];continue;}
                if (j==0) {dp[i][j] = grid[i][j]+dp[i-1][j];continue;}
                dp[i][j] = grid[i][j]+Math.min(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[m-1][n-1];
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int a[][] ={{1,2,5},{6,10,4},{3,2,1}};
        System.out.println(solution.minPathSum(a));
    }
}


