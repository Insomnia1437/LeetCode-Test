import java.util.HashMap;
import java.util.Map;

/**
 Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

 Examples:

 s = "leetcode"
 return 0.

 s = "loveleetcode",
 return 2.
 Note: You may assume the string contain only lowercase letters.
 */
public class Solution {
    public int firstUniqChar(String s) {
        int pos=-1;
        Map<Character,Integer> map = new HashMap<>();
        for (char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1){
                pos = i;
                break;
            }
        }
        return pos;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.firstUniqChar("leletcode"));

    }
}


