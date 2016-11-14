
/**
 Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

 Integers in each row are sorted from left to right.
 The first integer of each row is greater than the last integer of the previous row.
 For example,

 Consider the following matrix:

 [
 [1,   3,  5,  7],
 [10, 11, 16, 20],
 [23, 30, 34, 50]
 ]
 Given target = 3, return true.
 */
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int lo=0,hi=(row*col)-1;
        while (lo<=hi){
            int mid = lo+(hi-lo)/2;
            int midrow = mid/col;
            int midcol = mid%col;
            if (matrix[midrow][midcol] == target)
                return true;
            else if (matrix[midrow][midcol] < target)
                lo=mid+1;
            else if (matrix[midrow][midcol] > target)
                hi=mid-1;
        }
        return false;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int a[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
        System.out.println(solution.searchMatrix(a,34));
    }
}


