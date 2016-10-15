import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

 Note: The solution set must not contain duplicate triplets.

 For example, given array S = [-1, 0, 1, 2, -1, -4],

 A solution set is:
 [
 [-1, 0, 1],
 [-1, -1, 2]
 ]
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp;
        if (nums.length==0||nums.length<3) return res;
        Arrays.sort(nums);
        int tar;
        for (int i = 0; i < nums.length; i++) {
            tar = nums[i];
            int j=i+1,k=nums.length-1;
            while (j<k){
                if ((nums[j]+nums[k]) == -1*tar){
                    temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    if (!res.contains(temp)){
                        res.add(temp);
                    }
                    j++;
                    k--;
                }else if ((nums[j]+nums[k]) < -1*tar){
                    j++;
                }else if ((nums[j]+nums[k]) > -1*tar){
                    k--;
                }
            }
    }
    return res;
}
    public static void main(String[] args) {
        Solution solution = new Solution();
        int test[] = {1,2,-2,-1};
        List<List<Integer>> res;
        res = solution.threeSum(test);
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
    }
}


