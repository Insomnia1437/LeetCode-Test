
/**
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
 * <p>
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 * <p>
 * You may assume that each input would have exactly one solution.
 * <p>
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 */
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int res[] = {0, 0};
        int i = 0, j = numbers.length-1;
        while (i < j) {
            int t = numbers[i] + numbers[j];
            if (t < target) {
                i++;
            } else if (t > target) {
                j--;
            } else {
                res[0] = i + 1;
                res[1] = j + 1;
                break;
            }
        }
        return res;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        int a[] = {2,7,11,15};
        int res[] = s.twoSum(a,9);
        System.out.println(res[0]+":"+res[1]);
    }
}
