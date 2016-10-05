import java.util.Arrays;

/**
 Given two strings s and t, write a function to determine if t is an anagram of s.

 For example,
 s = "anagram", t = "nagaram", return true.
 s = "rat", t = "car", return false.

 Note:
 You may assume the string contains only lowercase alphabets.

 Follow up:
 What if the inputs contain unicode characters? How would you adapt your solution to such case?
 */
public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length())
            return false;
        if (s=="")
            return true;
        char stemp[] = s.toCharArray();
        char ttemp[] = t.toCharArray();
        Arrays.sort(stemp);
        Arrays.sort(ttemp);
        String ss = String.valueOf(stemp);
        String tt = String.valueOf(ttemp);
        if (ss.hashCode() == tt.hashCode())
            return true;
        return false;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "abc";
        String t = "cbb";
        System.out.println(solution.isAnagram(s,t));
    }
}


