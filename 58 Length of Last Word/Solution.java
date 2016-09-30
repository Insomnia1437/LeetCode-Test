
/**
 Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

 If the last word does not exist, return 0.

 Note: A word is defined as a character sequence consists of non-space characters only.

 For example,
 Given s = "Hello World",
 return 5.
 */
public class Solution {
    public int lengthOfLastWord(String s) {
        int lol=0;
        int len = s.length();
        if (len == 0 )
            return 0;
        int right=len-1;
        int i=len-1;
        while (i>=0){
            while (s.charAt(i)==' ' && i>0){
                i--;
            }
            right=i;
            while (s.charAt(i)!=' ' && i>0){
                i--;
            }
            if (i==0 && s.charAt(i)!=' ')
                lol = right-i+1;
            else
                lol = right-i;
            break;
        }
        return lol;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        int res;
        res = s.lengthOfLastWord("   ");
        System.out.println(res);
    }
}
/*
C solution
int lengthOfLastWord(char* s) {
    int len = strlen(s), wordLen = 0;
    while (len--) {
        if (s[len] == ' ' && wordLen) {
            break;
        } else if (s[len] != ' ') {
            wordLen++;
        }
    }
    return wordLen;
}
 */