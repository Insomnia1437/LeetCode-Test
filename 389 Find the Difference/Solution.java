
/**
 * Given two strings s and t which consist of only lowercase letters.
 * <p>
 * String t is generated by random shuffling string s and then add one more letter at a random position.
 * <p>
 * Find the letter that was added in t.
 * <p>
 * Example:
 * <p>
 * Input:
 * s = "abcd"
 * t = "abcde"
 * <p>
 * Output:
 * e
 * <p>
 * Explanation:
 * 'e' is the letter that was added.
 */
public class Solution {
    public char findTheDifference(String s, String t) {
        char res=0;
        String temp = s+t;
        for (int i = 0; i < temp.length(); i++) {
            res ^= temp.charAt(i);
        }
        return res;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        char res = s.findTheDifference("abcd","abcde");
        System.out.println(res);
    }
}
