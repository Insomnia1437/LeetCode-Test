import java.util.ArrayList;
import java.util.List;

/**
 Given a set of distinct integers, nums, return all possible subsets.

 Note: The solution set must not contain duplicate subsets.

 For example,
 If nums = [1,2,3], a solution is:

 [
 [3],
 [1],
 [2],
 [1,2,3],
 [1,3],
 [2,3],
 [1,2],
 []
 ]
 */
public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        res.add(temp);
        backtracking(res,temp,nums,0);
        return res;
    }
    public void backtracking(List<List<Integer>> res,List<Integer> temp,int[] nums,int begin){
        if (temp.size()>0){
            res.add(new ArrayList<>(temp));
        }
        for (int i = begin; i < nums.length; i++) {
            temp.add(nums[i]);
            backtracking(res,temp,nums,i+1);
            temp.remove(temp.size()-1);
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int a[] = {1,2,3};
        List<List<Integer>> res = solution.subsets(a);
        for (List<Integer> l:res){
            System.out.println(l);
        }
    }
}


