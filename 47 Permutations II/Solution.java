import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        perm(nums,0,nums.length-1,res);
        return res;
    }
    public void perm(int nums[],int k,int m,List<List<Integer>> ret){
        if (k>m){
            List<Integer> curr = new ArrayList<>();
            for(int n:nums)
                curr.add(n);
            ret.add(curr);
            return;
        }
        Set<Integer> used = new HashSet<>();
        for (int i=k;i<=m;i++){
            if (used.add(nums[i])){
                swap(nums,i,k);
                perm(nums,k+1,m,ret);
                swap(nums,i,k);
            }

        }
    }
    public void swap(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int t[]={1,1,2};
        List<List<Integer>> r = solution.permuteUnique(t);
        for (List<Integer> l:r)
            System.out.println(l);

    }
}


