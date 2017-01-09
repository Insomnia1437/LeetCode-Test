
/**
 Given a string S and a string T, count the number of distinct subsequences of T in S.

 A subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (ie, "ACE" is a subsequence of "ABCDE" while "AEC" is not).

 Here is an example:
 S = "rabbbit", T = "rabbit"

 Return 3.
 **
 */
public class Solution {
    public int numDistinct(String s, String t) {
        int sl = s.length();
        int tl = t.length();
        int dp[][] = new int[tl+1][sl+1];

        for (int i = 0; i <= sl; i++) {
            dp[0][i] = 1;
        }

        for (int i = 0; i < tl; i++) {
            for (int j = 0; j < sl; j++) {
                if (s.charAt(j) == t.charAt(i)){
                    dp[i+1][j+1] = dp[i][j] + dp[i+1][j];
                }
                else
                    dp[i+1][j+1] = dp[i+1][j];
            }
        }
        return dp[tl][sl];
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numDistinct("rabbbit", ""));
    }
}


