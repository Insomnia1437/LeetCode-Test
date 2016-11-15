import java.util.ArrayList;
import java.util.List;

/**
 Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.

 For example,
 If n = 4 and k = 2, a solution is:

 [
 [2,4],
 [3,4],
 [2,3],
 [1,2],
 [1,3],
 [1,4],
 ]
 */
public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        backtracking(res,temp,n,k,1);
        return res;
    }
    public void backtracking(List<List<Integer>> res,List<Integer> temp,int n,int k,int begin){
        if (temp.size() == k){
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = begin; i <= n; i++) {
            temp.add(i);
            backtracking(res,temp,n,k,i+1);
            temp.remove(temp.size()-1);
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> res = solution.combine(4,2);
        for (List<Integer> l:res){
            System.out.println(l);
        }
    }
}


