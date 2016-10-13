
/**
 Given a string S, find the longest palindromic substring in S.
 You may assume that the maximum length of S is 1000, and there exists one unique longest palindromic substring.
 */
public class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1)
            return s;
        int start=0,maxlen=1;
        boolean isPalindrome[][] = new boolean[1000][1000];
        for (int i = s.length()-1; i >= 0; i--) {
            for (int j = i; j < s.length(); j++) {
                if ((i+1>j-1 || isPalindrome[i+1][j-1]) && s.charAt(i)==s.charAt(j)){
                    isPalindrome[i][j]=true;
                    if (j-i+1>maxlen){
                        maxlen = j-i+1;
                        start=i;
                    }
                }

            }
        }
        return s.substring(start,maxlen+start);
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome("abb"));

    }
}


