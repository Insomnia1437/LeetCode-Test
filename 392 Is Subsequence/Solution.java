
/**
 Given a string s and a string t, check if s is subsequence of t.

 You may assume that there is only lower case English letters in both s and t. t is potentially a very long (length ~= 500,000) string, and s is a short string (<=100).

 A subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (ie, "ace" is a subsequence of "abcde" while "aec" is not).

 Example 1:
 s = "abc", t = "ahbgdc"

 Return true.

 Example 2:
 s = "axc", t = "ahbgdc"

 Return false.

 Follow up:
 If there are lots of incoming S, say S1, S2, ... , Sk where k >= 1B, and you want to check one by one to see if T has its subsequence. In this scenario, how would you change your code?
 */
public class Solution {
    /*
    other's solution and java has method indexOf which is much fast than charAt.
    this solution only cost 2ms while mine cost 36ms
    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) return false;
        int prev = -1;
        for (char ch : s.toCharArray()) {
            prev = t.indexOf(ch, prev + 1);
            if (prev < 0) return false;
        }
        return true;
    }
     */
    public boolean isSubsequence(String s, String t) {
        int len = t.length();
        if (s.length() == 0)
            return true;
        if (len<s.length())
            return false;
        char ch[] = s.toCharArray();
        int i=0,j=0;
        while (i<len){
            int p = findFirstInSequence(ch[j],t);
            if (p >= 0){
                if (j==s.length()-1){
                    return true;
                }
                t = t.substring(p+1);
                j++;
                i += p+1;
            }else
                return false;
        }
        return false;
    }
    private int findFirstInSequence(char c,String str){
        for (int i = 0; i < str.length(); i++) {
            if (c == str.charAt(i)){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "abc";
        String t = "asjhdjsooieroc";
        System.out.println(solution.isSubsequence(s,t));
    }
}


