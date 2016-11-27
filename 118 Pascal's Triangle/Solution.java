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
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows<1) return res;
        for (int i = 1; i <= numRows; i++) {
            List<Integer> temp = new ArrayList<>(i);
            temp.add(1);
            if (i == 1){
                res.add(temp);
                continue;
            }
            for (int j = 1; j < i-1; j++) {
                temp.add(res.get(i-2).get(j)+res.get(i-2).get(j-1));
            }
            temp.add(1);
            res.add(temp);
        }

        return res;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println();

    }
}


