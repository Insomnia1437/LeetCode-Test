
/**
 Given a string array words, find the maximum value of length(word[i]) * length(word[j]) where the two words do not share common letters. You may assume that each word will contain only lower case letters. If no such two words exist, return 0.

 Example 1:
 Given ["abcw", "baz", "foo", "bar", "xtfn", "abcdef"]
 Return 16
 The two words can be "abcw", "xtfn".

 Example 2:
 Given ["a", "ab", "abc", "d", "cd", "bcd", "abcd"]
 Return 4
 The two words can be "ab", "cd".

 Example 3:
 Given ["a", "aa", "aaa", "aaaa"]
 Return 0
 No such pair of words.
 */
public class Solution {
    public int maxProduct(String[] words) {
        int max=0;
        int sum;
        int len = words.length;
        int value[] = new int[len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                value[i] |= 1 << (words[i].charAt(j)-'a');
            }
        }

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if ((value[i] & value[j]) == 0){
                    sum = words[i].length()*words[j].length();
                    max = (max<sum)?sum:max;
                }
            }
        }
        return max;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        String words[] = {"a", "ab", "abc", "d", "cd", "bcd", "abcd"};
        System.out.println(solution.maxProduct(words));
    }
}


