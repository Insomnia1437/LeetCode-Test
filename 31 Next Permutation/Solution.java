import java.util.*;

/**
 Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.

 If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).

 The replacement must be in-place, do not allocate extra memory.

 Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.

 1,2,3 → 1,3,2
 3,2,1 → 1,2,3
 1,1,5 → 1,5,1
 */
public class Solution {
    public void nextPermutation(int[] nums) {
        if (nums==null||nums.length<=1) return;
        int len=nums.length-1;
        int i,temp;
        for (i = len; i >= 1; i--) {
            if (nums[i]>nums[i-1])
                break;
        }
        if (i!=0){
            for (int j = len; j > i-1; j--) {
                if (nums[j]>nums[i-1]){
                    temp=nums[j];
                    nums[j]=nums[i-1];
                    nums[i-1]=temp;
                    break;
                }
            }
        }
        reverse(nums,i,len);

    }
    public void reverse(int[] nums,int l,int r){
        while (l<r){
            int temp=nums[r];
            nums[r]=nums[l];
            nums[l]=temp;
            l++;r--;
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int t[] = {2,1};
        solution.nextPermutation(t);
        for (int i:t){
            System.out.print(i+" ");
        }
    }
}


