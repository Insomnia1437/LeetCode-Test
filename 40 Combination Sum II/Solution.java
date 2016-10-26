import java.util.*;

/**
 Given a collection of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

 Each number in C may only be used once in the combination.

 Note:
 All numbers (including target) will be positive integers.
 The solution set must not contain duplicate combinations.
 For example, given candidate set [10, 1, 2, 7, 6, 1, 5] and target 8,
 A solution set is:
 [
 [1, 7],
 [1, 2, 5],
 [2, 6],
 [1, 1, 6]
 ]
 */
public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        backtracking(candidates,target,0,temp,res);
        Set<List<Integer>> set = new HashSet<>();
        set.addAll(res);
        return new ArrayList<>(set);
    }
    public void backtracking(int[] candidates,int target,int pos,List<Integer> temp,List<List<Integer>> res){
        if (target<0) return;
        else if (target==0) res.add(new ArrayList<Integer>(temp));
        else {
            for (int i = pos; i < candidates.length; i++) {
                temp.add(candidates[i]);
                backtracking(candidates,target-candidates[i],i+1,temp,res);
                temp.remove(temp.size()-1);
            }
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int t[] = {10,1,2,7,6,1,5};
        List<List<Integer>> r = solution.combinationSum2(t,8);
        for (List<Integer> ll:r){
            System.out.println(ll);
        }

    }
}


