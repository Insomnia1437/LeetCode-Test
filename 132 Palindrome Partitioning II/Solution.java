

/**
 Given a string s, partition s such that every substring of the partition is a palindrome.

 Return the minimum cuts needed for a palindrome partitioning of s.

 For example, given s = "aab",
 Return 1 since the palindrome partitioning ["aa","b"] could be produced using 1 cut.
 **
 */
public class Solution {
    public int minCut(String s) {
        if (s.length() == 0) return 0;
        int cut[] = new int[s.length()+1];
        for (int i = 0; i <= s.length(); i++) {
            cut[i] = Integer.MAX_VALUE;
        }
        cut[s.length()] = -1;
        for (int i = s.length()-1; i >= 0; i--) {
            for (int a=i,b=i;a>=0 && b<s.length() && s.charAt(a) == s.charAt(b);a--,b++) {
                cut[a] = Math.min(cut[a],1+cut[b+1]);
            }
            for (int a=i,b=i+1;a>=0 && b<s.length() && s.charAt(a) == s.charAt(b);a--,b++) {
                cut[a] = Math.min(cut[a],1+cut[b+1]);
            }
        }
        return cut[0];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minCut("aabbaabbc"));
    }
}


