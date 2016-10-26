import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 Given a set of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

 The same repeated number may be chosen from C unlimited number of times.

 Note:
 All numbers (including target) will be positive integers.
 The solution set must not contain duplicate combinations.
 For example, given candidate set [2, 3, 6, 7] and target 7,
 A solution set is:
 [
 [7],
 [2, 2, 3]
 ]
 */
public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        backtracking(candidates,target,0,temp,res);
        return res;
    }
    public void backtracking(int[] candidates,int target,int pos,List<Integer> temp,List<List<Integer>> res){
        if (target<0) return;
        else if (target==0) res.add(new ArrayList<Integer>(temp));
        else {
            for (int i = pos; i < candidates.length; i++) {
                temp.add(candidates[i]);
                backtracking(candidates,target-candidates[i],i,temp,res);
                temp.remove(temp.size()-1);
            }
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int t[] = {2,3,6,7};
        List<List<Integer>> r = solution.combinationSum(t,7);
        for (List<Integer> ll:r){
            System.out.println(ll);
        }

    }
}


