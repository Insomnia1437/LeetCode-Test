import java.util.*;

/**
 Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
 */
public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        permutation(nums,0,nums.length-1,res);
        return res;
    }
    public void permutation(int nums[],int k,int m,List<List<Integer>> list){
        if (k>m){
            List<Integer> t = new ArrayList<>();
            for (int i:nums)
                t.add(i);
            list.add(t);
            return;
        }
        for (int i = k; i <=m ; i++) {
            int temp;
            temp=nums[i];
            nums[i]=nums[k];
            nums[k]=temp;
            permutation(nums,k+1,m,list);
            temp=nums[i];
            nums[i]=nums[k];
            nums[k]=temp;
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int t[] = {1,2,5};
        List<List<Integer>> res = solution.permute(t);
        for(List<Integer> ll:res){
            System.out.println(ll);
        }
    }
}


