import java.util.HashMap;
import java.util.Map;

/**
 Given a string, find the length of the longest substring T that contains at most k distinct characters.

 For example, Given s = “eceba” and k = 2,

 T is "ece" which its length is 3.
 */
public class Solution {
    public int lengthOfLongestSubstringKDistinct(String s,int k) {
        Map<Character,Integer> map = new HashMap<>();
        char c[] = s.toCharArray();
        int len = c.length;
        int left=0;
        int max=0;
        for (int i = 0; i < len; i++) {
            if (!map.containsKey(c[i])){
                map.put(c[i],1);
            }else {
                map.put(c[i],map.get(c[i])+1);
            }
            if (map.size()>k){
                map.put(c[left],map.get(c[left])-1);
                if (map.get(c[left])==0){
                    map.remove(c[left]);
                }
                left++;
            }
            if (max<(i-left+1))
                max=i-left+1;
        }
        return max;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        int res;
        res = s.lengthOfLongestSubstringKDistinct("ecebeba",2);
        System.out.println(res);
    }
}