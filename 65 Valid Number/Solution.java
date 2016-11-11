
/**
 Validate if a given string is numeric.

 Some examples:
 "0" => true
 " 0.1 " => true
 "abc" => false
 "1 a" => false
 "2e10" => true
 */
public class Solution {
    public boolean isNumber(String s) {
        return s.matches("\\s*[+-]?(\\d+(\\.\\d*)?|\\.\\d+)(e[+-]?\\d+)?\\s*");
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isNumber("2e0"));
    }
}


