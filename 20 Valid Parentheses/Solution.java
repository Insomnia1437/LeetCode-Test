import java.util.Stack;

/**
 Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

 The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack();
        boolean v = true;
        int len = s.length();
        char ch;
        if ((len&0x1) == 1)
            v=false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' ||s.charAt(i) == '{'){
                st.push(s.charAt(i));
            }else {
                if (st.isEmpty()){
                    v=false;
                    break;
                }
                if (s.charAt(i)==')'){
                    if (st.peek() == '('){
                        st.pop();
                    }else
                        v=false;
                }else if (s.charAt(i) == ']'){
                    if (st.peek() == '['){
                        st.pop();
                    }else
                        v=false;
                }else if (s.charAt(i) == '}'){
                    if (st.peek() == '{'){
                        st.pop();
                    }else
                        v=false;
                }else
                    v=false;

            }

        }
        if (!st.isEmpty())
            v=false;

        return v;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isValid("(("));
    }
}