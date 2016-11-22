import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;

/**
 Given a string containing only digits, restore it by returning all possible valid IP address combinations.

 For example:
 Given "25525511135",

 return ["255.255.11.135", "255.255.111.35"]. (Order does not matter)
 */
public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        if (s.length()>12 || s.length()<4) return res;
        backtracking(res,"",s,0);
        return res;
    }

    public void backtracking(List<String> res,String temp,String s,int start){
        if (start == s.length() && temp.length() == s.length()+3){
            res.add(temp);
            return;
        }
        for (int i = start+1; i <= s.length() && i <= start+3; i++) {
            String t = s.substring(start,i);
            if (isValid(t)){
                backtracking(res,temp.length()==0?t:temp+"."+t,s,i);
            }
        }
    }
    public boolean isValid(String temp){
        if (temp.charAt(0) == '0') return temp.length()==1;
        int t = Integer.valueOf(temp);
        return  (t>=0 && t<=255);
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.restoreIpAddresses("25525511135"));

    }
}


