
/**
 You are given an n x n 2D matrix representing an image.

 Rotate the image by 90 degrees (clockwise).

 Follow up:
 Could you do this in-place?
 */
public class Solution {
    public void rotate(int[][] matrix) {
        int len=matrix.length;
        int res[][]=new int[len][len];

        for (int i = len-1; i >= 0; i--) {
            for (int j = 0; j < len; j++) {
                res[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                matrix[i][j]=res[i][len-1-j];
            }
        }

    }
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int a[]={4,2,0,0,1,1,4,4,4,0,4,0};
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        solution.rotate(a);

    }
}


