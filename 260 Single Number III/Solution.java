

/**
 * Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.
 * <p>
 * For example:
 * <p>
 * Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].
 * <p>
 * Note:
 * The order of the result is not important. So in the above example, [5, 3] is also correct.
 * Your algorithm should run in linear runtime complexity. Could you implement it using only constant space complexity?
 */
public class Solution {
    public int[] singleNumber(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            temp ^= nums[i];
        }
        String s = Integer.toBinaryString(temp);
        int j;
        for (j = s.length() - 1; j >= 0; j--) {
            if (s.charAt(j) == '1') {
                break;
            }
        }
        j=s.length()-1-j;
        int m = 0, n = 0;
        for (int i = 0; i < nums.length; i++) {
            if ( (nums[i]&(int)Math.pow(2,j)) == 0){
                m^= nums[i];
            }else
                n^= nums[i];

        }
        int res[] = {m, n};

        return res;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        int n[] = {43772400,1674008457,1779561093,744132272,1674008457,448610617,1779561093,124075538,-1034600064,49040018,612881857,390719949,-359290212,-812493625,124732,-1361696369,49040018,-145417756,-812493625,2078552599,1568689850,865876872,865876872,-1471385435,1816352571,1793963758,2078552599,-1034600064,1475115274,-119634980,124732,661111294,-1813882010,1568689850,448610617,1347212898,-1293494866,612881857,661111294,-1361696369,1816352571,-1813882010,-359290212,1475115274,1793963758,1347212898,43772400,-1471385435,124075538,-1293494866,-119634980,390719949};
        int res[] = s.singleNumber(n);
        System.out.println(res[0]);
        System.out.println(res[1]);

    }
}
