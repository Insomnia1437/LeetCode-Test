
/**
 A message containing letters from A-Z is being encoded to numbers using the following mapping:

 'A' -> 1
 'B' -> 2
 ...
 'Z' -> 26
 Given an encoded message containing digits, determine the total number of ways to decode it.

 For example,
 Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).

 The number of ways decoding "12" is 2.
 */
public class Solution {
    public int numDecodings(String s) {
        if (s.length() == 0) return 0;
        int dp[] = new int[s.length()+1];
        dp[0] = 1;
        dp[1] = s.charAt(0)=='0'?0:1;
        for (int i = 2; i <= s.length(); i++) {
            if (s.charAt(i-1) >= '1' && s.charAt(i-1) <= '9'){
                dp[i] = dp[i-1];
            }
            int t = Integer.valueOf(s.substring(i-2,i));
            if (t>=10 && t<=26){
                dp[i]+=dp[i-2];
            }
        }
        return dp[s.length()];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numDecodings("100"));
    }
}


