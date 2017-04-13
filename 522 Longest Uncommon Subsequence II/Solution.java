import java.util.Arrays;
import java.util.Comparator;

/**
 Given a list of strings, you need to find the longest uncommon subsequence among them. The longest uncommon subsequence is defined as the longest subsequence of one of these strings and this subsequence should not be any subsequence of the other strings.

 A subsequence is a sequence that can be derived from one sequence by deleting some characters without changing the order of the remaining elements. Trivially, any string is a subsequence of itself and an empty string is a subsequence of any string.

 The input will be a list of strings, and the output needs to be the length of the longest uncommon subsequence. If the longest uncommon subsequence doesn't exist, return -1.

 Example 1:
 Input: "aba", "cdc", "eae"
 Output: 3
 Note:

 All the given strings' lengths will not exceed 10.
 The length of the given list will be in the range of [2, 50].
 **
 */

public class Solution {
    public int findLUSlength(String[] strs) {
        int len = strs.length;
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length()-o1.length();
            }
        });
        for (int i = 0; i < len; i++) {
            int count = len-1;
            for (int j = 0; j < len; j++) {
                if (i != j && !isSubSequence(strs[i],strs[j])) count--;
            }
            if (count == 0) return strs[i].length();
        }
        return -1;
    }
    public boolean isSubSequence(String a, String b) {
        int count = 0;
        for (char c : b.toCharArray()) {
            if (count<a.length() && a.charAt(count)==c) count++;
        }
        return count == a.length();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] a = {"abc","acccc","acccc","abcc"};
        System.out.println(solution.findLUSlength(a));



    }

}

