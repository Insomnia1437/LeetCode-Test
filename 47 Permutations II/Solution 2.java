import java.util.*;

/**
 Given a collection of numbers that might contain duplicates, return all possible unique permutations.

 For example,
 [1,1,2] have the following unique permutations:
 [
 [1,1,2],
 [1,2,1],
 [2,1,1]
 ]

 */
public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean used[] = new boolean[nums.length];
        Arrays.sort(nums);
        perm(nums,new ArrayList<>(),res,used);
        return res;
    }
    public void perm(int[] nums,List<Integer> temp,List<List<Integer>> res,boolean[] used){
        if (temp.size()==nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]){
                if (i>0 && nums[i]==nums[i-1] && used[i-1]) continue;
                used[i]=true;
                temp.add(nums[i]);
                perm(nums,temp,res,used);
                temp.remove(temp.size()-1);
                used[i]=false;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int t[]={3,3,0,3};
        List<List<Integer>> r = solution.permuteUnique(t);
        for (List<Integer> l:r)
            System.out.println(l);

    }
}


