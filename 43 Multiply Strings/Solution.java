
/**
 Given two numbers represented as strings, return multiplication of the numbers as a string.

 Note:
 The numbers can be arbitrarily large and are non-negative.
 Converting the input string to integer is NOT allowed.
 You should NOT use internal library such as BigInteger.

 */
public class Solution {
    public String multiply(String num1, String num2) {
        int pos[]=new int[num1.length()+num2.length()];
        for (int i = num1.length()-1; i >= 0; i--) {
            for (int j = num2.length()-1; j >= 0; j--) {
                int mul = (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                int p=i+j,q=i+j+1;

                int sum=mul+pos[q];
                pos[p] += sum/10;
                pos[q] = sum%10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int p:pos){
            if (!(sb.length()==0 && p==0))
                sb.append(p);
        }
        return sb.length()==0?"0":sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.multiply("999","12"));

    }
}


