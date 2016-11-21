import java.util.Stack;

/**
 Given a 2D binary matrix filled with 0's and 1's, find the largest rectangle containing only 1's and return its area.

 For example, given the following matrix:

 1 0 1 0 0
 1 0 1 1 1
 1 1 1 1 1
 1 0 0 1 0
 */
public class Solution {

    public int largestRectangleArea(int[] height){
        Stack<Integer> stack = new Stack<>();
        int len = height.length;
        int i=0,maxarea=0;
        while (i <= len){
            int h = (i==len?0:height[i]);
            if (stack.isEmpty() || h>=height[stack.peek()])
                stack.push(i++);
            else{
                int tp = stack.pop();
                maxarea = Math.max(maxarea, height[tp] * (stack.isEmpty()?i:i-1-stack.peek()));
            }
        }
        return maxarea;
    }
    public int maximalRectangle(char[][] matrix) {
        if (matrix==null || matrix.length==0) return 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int dp[][] = new int[row][col];
        int max = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i==0){
                    if (matrix[0][j] == '1')
                        dp[0][j] = 1;
                    continue;
                }
                dp[i][j] = matrix[i][j] == '1'?dp[i-1][j]+1:0;
            }
            max = Math.max(max,largestRectangleArea(dp[i]));
        }
        return max;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        char a[][] = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        System.out.println(solution.maximalRectangle(a));
    }
}


