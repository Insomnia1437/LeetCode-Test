

/**
 Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

 For example,
 Given n = 3,

 You should return the following matrix:
 [
 [ 1, 2, 3 ],
 [ 8, 9, 4 ],
 [ 7, 6, 5 ]
 ]
 */
public class Solution {
    public int[][] generateMatrix(int n) {

        int res[][] = new int[n][n];
        if (n==0) return res;
        int rowBegin=0,rowEnd=n-1;
        int colBegin=0,colEnd=n-1;
        for (int i = 1; i <= n*n;) {
            for (int j = colBegin; j <= colEnd; j++) {
                res[rowBegin][j]=i++;
            }
            rowBegin++;

            for (int j = rowBegin; j <= rowEnd; j++) {
                res[j][colEnd]=i++;
            }
            colEnd--;

            if (rowBegin<=rowEnd){
                for (int j = colEnd; j >= colBegin; j--) {
                    res[rowEnd][j]=i++;
                }
            }
            rowEnd--;

            if(colBegin<=colEnd){
                for (int j = rowEnd; j >= rowBegin; j--) {
                    res[j][colBegin]=i++;
                }
            }
            colBegin++;
        }
        return res;

    }
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int a[]={4,2,0,0,1,1,4,4,4,0,4,0};

    }
}


