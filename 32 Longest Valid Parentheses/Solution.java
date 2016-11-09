import java.util.Stack;

/**
 Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.

 For "(()", the longest valid parentheses substring is "()", which has length = 2.

 Another example is ")()())", where the longest valid parentheses substring is "()()", which has length = 4.
 */
public class Solution {
    public int longestValidParentheses(String s) {
        char left='(',right=')';
        int lvp=0;
        int len=s.length();
        int dp[] = new int[len+1];
        int lp=0;
        char ch[] = s.toCharArray();
        for (int i = 0; i < len; i++) {
            if (ch[i]==left){
                lp++;
            }else if (ch[i]==right && lp>0){
                dp[i+1] = dp[i]+2;
                dp[i+1] += dp[i+1-dp[i+1]];
                lp--;
            }
            lvp = Math.max(lvp,dp[i+1]);
        }
        return lvp;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int a[]={4,2,0,0,1,1,4,4,4,0,4,0};
//        int a[]={9,9};
        System.out.println(solution.longestValidParentheses("()(()"));
    }
}


