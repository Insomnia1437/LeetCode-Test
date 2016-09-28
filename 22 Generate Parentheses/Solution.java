import java.util.LinkedList;
import java.util.List;

/**
 Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

 For example, given n = 3, a solution set is:

 [
 "((()))",
 "(()())",
 "(())()",
 "()(())",
 "()()()"
 ]
 */
public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> pt = new LinkedList<>();
        String temp="";
        generate(pt,temp,n,n);
        return pt;
    }
    private void generate(List<String> list,String str,int left,int right){
        if (left == 0&&right ==0){
            list.add(str);
            return;
        }
        if (left>0){
            generate(list,str+"(",left-1,right);
        }
        if(right>0 && left<right){
            generate(list,str+")",left,right-1);
        }
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        List<String> res = s.generateParenthesis(4);
        for (int i = 0; i < res.size() ; i++) {
            System.out.println(res.get(i));
        }
    }
}
