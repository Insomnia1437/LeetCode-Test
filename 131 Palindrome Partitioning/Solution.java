import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 Given a string s, partition s such that every substring of the partition is a palindrome.

 Return all possible palindrome partitioning of s.

 For example, given s = "aab",
 Return

 [
 ["aa","b"],
 ["a","a","b"]
 ]
 **
 */
public class Solution {
    public List<List<String>> partition(String s) {
        if (s == null) return null;
        List<List<String>> res = new ArrayList<>();
        backtrack(res,new ArrayList<>(),s,0);
        return res;
    }
    public void backtrack(List<List<String>> res,List<String> temp,String s,int l) {
        if (temp.size()>0 && l>=s.length()) {
            res.add(new ArrayList<>(temp));
        }
        for (int i = l; i < s.length(); i++) {
            if (isPalindrome(s,l,i)) {
                if (l==i) {
                    temp.add(Character.toString(s.charAt(i)));
                }
                else {
                    temp.add(s.substring(l,i+1));
                }
                backtrack(res,temp,s,i+1);
                temp.remove(temp.size()-1);
            }
        }
    }
    public boolean isPalindrome(String str, int l, int r){
        if(l==r) return true;
        while(l<r){
            if(str.charAt(l)!=str.charAt(r)) return false;
            l++;r--;
        }
        return true;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.partition("aab"));
    }
}


