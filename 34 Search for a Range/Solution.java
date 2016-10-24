import java.util.*;

/**
 Given a sorted array of integers, find the starting and ending position of a given target value.

 Your algorithm's runtime complexity must be in the order of O(log n).

 If the target is not found in the array, return [-1, -1].

 For example,
 Given [5, 7, 7, 8, 8, 10] and target value 8,
 return [3, 4].
 */
public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int result[]={-1,-1};
        if (nums.length==0 ||(nums.length==1 && nums[0]!=target))
            return result;
        int s=0,l=nums.length-1;
        int mid=0,temp=0;
        boolean find=false;
        while (s<=l){
            mid=(l+s)/2;
            if (nums[mid]==target){
                temp=mid;
                find=true;
                break;
            }else if(nums[mid]<target){
                s=mid+1;
            }else
                l=mid-1;
        }
        if (!find)
            return result;
        int sp=temp,ep=temp;
        while (sp>0 && nums[sp-1]==target){
            sp--;
        }
        while (ep<nums.length-1 && nums[ep+1]==target){
            ep++;
        }
        result[0]=sp;
        result[1]=ep;
        return result;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int t[] = {1,1,2};
        int res[]=solution.searchRange(t,1);
        for (int i:res)
            System.out.println(i);

    }
}


