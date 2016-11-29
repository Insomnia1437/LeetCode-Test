
/**
 Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

 For example,
 "A man, a plan, a canal: Panama" is a palindrome.
 "race a car" is not a palindrome.

 Note:
 Have you consider that the string might be empty? This is a good question to ask during an interview.

 For the purpose of this problem, we define empty string as valid palindrome.
 */
public class Solution {
    public boolean isPalindrome(String s) {
        if (s == null) return true;
        if (s.length() == 1 && Character.isLetter(s.charAt(0))) return true;
        s = s.toLowerCase();
        int j = s.length()-1, i = 0;
        while (i<=j){
            if (!Character.isLetter(s.charAt(i)) && !Character.isDigit(s.charAt(i))) {
                i++;
                continue;
            }
            if (!Character.isLetter(s.charAt(j)) && !Character.isDigit(s.charAt(j))) {
                j--;
                continue;
            }
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            }else
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome("0P"));

    }
}


