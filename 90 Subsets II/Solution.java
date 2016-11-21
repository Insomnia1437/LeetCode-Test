import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 Given a collection of integers that might contain duplicates, nums, return all possible subsets.

 Note: The solution set must not contain duplicate subsets.

 For example,
 If nums = [1,2,2], a solution is:

 [
 [2],
 [1],
 [1,2,2],
 [2,2],
 [1,2],
 []
 ]
 */
public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        res.add(temp);
        Arrays.sort(nums);
        backtrack(res,temp,nums,0);
        return res;
    }
    public void backtrack(List<List<Integer>> res,List<Integer> temp,int[] nums,int start){
        if (temp.size() > 0){
            res.add(new ArrayList<>(temp));
        }
        for (int i = start; i < nums.length; i++) {
            if (i>start && nums[i]==nums[i-1])continue;
            temp.add(nums[i]);
            backtrack(res,temp,nums,i+1);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int a[] = {1,2,2};
        List<List<Integer>> res = solution.subsetsWithDup(a);
        for (List<Integer> l:res)
            System.out.println(l);
    }
}


