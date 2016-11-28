import java.util.ArrayList;
import java.util.List;

/**
 Given numRows, generate the first numRows of Pascal's triangle.

 For example, given numRows = 5,
 Return

 [
 [1],
 [1,1],
 [1,2,1],
 [1,3,3,1],
 [1,4,6,4,1]
 ]
 */
public class Solution {
    public List<Integer> getRow(int rowIndex) {
        rowIndex = rowIndex+1;
        List<Integer> res = new ArrayList<>(rowIndex);
        if (rowIndex<1) return res;
        for (int i = 1; i <= rowIndex; i++) {
            res.add(0,1);
            for (int j = 1; j < i-1; j++) {
                res.set(j,res.get(j)+res.get(j+1));
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.getRow(1));

    }
}


