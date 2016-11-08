
/**
 Given a non-negative number represented as an array of digits, plus one to the number.

 The digits are stored such that the most significant digit is at the head of the list.
 */
public class Solution {
    public int[] plusOne(int[] digits) {

        int carry = 1; // 进位标志，下一位来的进位标志
        int tmp;
        for (int i = digits.length - 1; i >= 0; i--) {
            tmp = digits[i];
            digits[i] = (tmp + carry) % 10; // 计算当前位的新值
            carry = (tmp + carry) / 10; // 计算新的进位

            if (carry == 0) { // 没有进位了就可以退出了
                break;
            }
        }

        if (carry == 1) { // 最后还有一个进位
            int[] result = new int[digits.length + 1];
            System.arraycopy(digits, 0, result, 1, digits.length);
            result[0] = carry;;
            return result;
        } else {
            return digits;
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int a[]={4,2,0,0,1,1,4,4,4,0,4,0};
        int a[]={9,9};
        int res[] = solution.plusOne(a);
        for (int i:res)
            System.out.println(i);
    }
}


