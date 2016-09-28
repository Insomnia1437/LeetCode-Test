import java.util.HashMap;
import java.util.Map;

/**
 Given a roman numeral, convert it to an integer.

 Input is guaranteed to be within the range from 1 to 3999.
 */
public class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> chmap = new HashMap<>();
        chmap.put('I',1);
        chmap.put('V',5);
        chmap.put('X',10);
        chmap.put('L',50);
        chmap.put('C',100);
        chmap.put('D',500);
        chmap.put('M',1000);
        int res=0;
        char current,next;
        for (int i = 0; i < s.length()-1; i++) {
            current=s.charAt(i);
            next=s.charAt(i+1);
            if (chmap.get(current)==null)
                res = 0;
            if (chmap.get(current)>=chmap.get(next)){
                res+=chmap.get(current);
            }else
                res-=chmap.get(current);

        }
        res+=chmap.get(s.charAt(s.length()-1));
        return res;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        int res = s.romanToInt("XCIII");
        System.out.println(res);
    }
}
