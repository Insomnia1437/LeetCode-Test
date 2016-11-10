
/**
 Given two binary strings, return their sum (also a binary string).

 For example,
 a = "11"
 b = "1"
 Return "100".
 */
public class Solution {
    public String addBinary(String a, String b) {
        int carry=0;
        StringBuilder res = new StringBuilder();
        if (a.length()<b.length())
            return addBinary(b,a);
        int al = a.length()-1;
        int bl = b.length()-1;
        while (al>=0 && bl>=0){
            int sum=(a.charAt(al)-'0')+(b.charAt(bl)-'0')+carry;
            if ((sum&1)==1){
                res.append(1);
            }else {
                res.append(0);
            }
            carry = sum>1?1:0;
            al--;
            bl--;
        }
        while (al>=0){
            if (carry==0){
                res.append(a.charAt(al--));
                continue;
            }
            int sum=(a.charAt(al)-'0')+carry;
            if ((sum&1)==1){
                res.append(1);
            }else {
                res.append(0);
            }
            carry = sum>1?1:0;
            al--;
        }
        if (carry==1){
            res.append(1);
        }
        return res.reverse().toString();
    }
    public static void main(String[] args) {
        Solution solution = new Solution();


        System.out.println(solution.addBinary("10","1111"));

    }
}


