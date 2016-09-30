import java.util.*;

/**
 Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

 You may assume that the array is non-empty and the majority element always exist in the array.
 */
public class Solution {

    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap();
        int len = nums.length;
        int me=nums[0];
        for (int i = 0; i < len; i++) {
            if (!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else {
                map.put(nums[i],map.get(nums[i])+1);
                if (map.get(nums[i])>len/2){
                    me=nums[i];
                }
            }
        }
        return me;
    }



    public static void main(String[] args) {
        Solution solution = new Solution();
        int a[] = {1,1,2,3};
        System.out.println(solution.majorityElement(a));

    }
}


/*
public class Solution {
    public int majorityElement(int[] num) {

        int major=num[0], count = 1;
        for(int i=1; i<num.length;i++){
            if(count==0){
                count++;
                major=num[i];
            }else if(major==num[i]){
                count++;
            }else count--;

        }
        return major;
    }
}
 */