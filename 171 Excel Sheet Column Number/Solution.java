
/**
 Related to question Excel Sheet Column Title

 Given a column title as appear in an Excel sheet, return its corresponding column number.

 For example:

 A -> 1
 B -> 2
 C -> 3
 ...
 Z -> 26
 AA -> 27
 AB -> 28
 */
public class Solution {
    public int titleToNumber(String s) {
        int res=0;
        int len = s.length();
        int count;
        for (int i = 0; i < len; i++) {
            count = s.charAt(i)-64;
            res += count*(int)Math.pow(26,len-1-i);
        }

        return res;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        String str="A";
        System.out.println(solution.titleToNumber(str));
    }
}


