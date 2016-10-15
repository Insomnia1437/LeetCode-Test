import java.util.Arrays;

/**
 Write a function to find the longest common prefix string amongst an array of strings.
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs==null) return null;
        if (strs.length==0) return "";
        Arrays.sort(strs);
        char first[] = strs[0].toCharArray();
        char last[] = strs[strs.length-1].toCharArray();

        int i=0,len=Math.min(first.length,last.length);
        while (i<len && first[i]==last[i]){
            i++;
        }
        return strs[0].substring(0,i);
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String test[]={"abcd","ajhd","askja","cbb"};
        System.out.println(solution.longestCommonPrefix(test));

    }
}


