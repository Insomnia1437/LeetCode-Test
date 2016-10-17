import java.util.*;

/**
 Implement strStr().

 Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */
public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length()>haystack.length()) return -1;
        if (needle.equals("")) return 0;
        int index=-1;
        int i=0,j=0;
        int hlen = haystack.length(),nlen = needle.length();
        for (;i<haystack.length();){
            int temp = i;
            if (needle.charAt(j) == haystack.charAt(i)){
                index = i;
                if (hlen-i<nlen-j)return -1;
                while (needle.charAt(j)==haystack.charAt(i)){
                    if (j==nlen-1) return index;
                    i++;j++;
                }
            }
            i=temp+1;
            j=0;
            index=-1;
        }
        return index;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.strStr("mississippi","sippj"));
    }
}


