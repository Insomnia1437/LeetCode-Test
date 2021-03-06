
/**
 Given a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).

 For example,
 S = "ADOBECODEBANC"
 T = "ABC"
 Minimum window is "BANC".

 Note:
 If there is no such window in S that covers all characters in T, return the empty string "".

 If there are multiple such windows, you are guaranteed that there will always be only one unique minimum window in S.
 */
public class Solution {
    public String minWindow(String s, String t) {
        int map[] = new int[256];
        int counter = t.length();int begin=0,end=0,head=0,len=Integer.MAX_VALUE;
        for (char c:t.toCharArray()){
            map[c]++;
        }
        while (end<s.length()){
            if (map[s.charAt(end++)]-- > 0)counter--;
            while (counter==0){
                if (end-begin<len){
                    len = end-begin;
                    head=begin;
                }
                if (map[s.charAt(begin++)]++ == 0) counter++;
            }
        }
        return len==Integer.MAX_VALUE?"":s.substring(head,head+len);
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minWindow("ADOBECODEBANC","ABC"));
    }
}


