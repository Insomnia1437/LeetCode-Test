
/**
 Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.

 Note:
 You must not modify the array (assume the array is read only).
 You must use only constant, O(1) extra space.
 Your runtime complexity should be less than O(n2).
 There is only one duplicate number in the array, but it could be repeated more than once.
 */
public class Solution {
    public int findDuplicate(int[] nums) {
        int min=1;
        int max = nums.length;
        while (min<=max){
            int mid = min+(max-min)/2;
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= mid)
                    count++;
            }
            if (count>mid){
                max = mid-1;
            }else {
                min = mid+1;
            }
        }
        return min;

    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int words[] = {3,1,2,2,4};
        System.out.println(solution.findDuplicate(words));
    }
}


