
/**
 Given an integer, convert it to a roman numeral.

 Input is guaranteed to be within the range from 1 to 3999.
 */
public class Solution {
    public String intToRoman(int num) {
        String string="";
        String s[][] = {{"","I","II","III","IV","V","VI","VII","VIII","IX"},
                        {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"},
                        {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"},
                        {"","M","MM","MMM"}};
        string+=s[3][num/1000%10];
        string+=s[2][num/100%10];
        string+=s[1][num/10%10];
        string+=s[0][num%10];
        return string;

    }


    public static void main(String[] args) {
        Solution s = new Solution();
        String res = s.intToRoman(1984);
        System.out.println(res);
    }
}
/*
Other's faster solution:
public class Solution {
  private static final int[] vals =
    new int[] { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

  private static final String[] strs =
    new String[] { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

  public String intToRoman(int num) {
    StringBuilder sb = new StringBuilder();
    int i = 0;
    while (num > 0) {
      while (num >= vals[i]) {
        sb.append(strs[i]);
        num -= vals[i];
      }
      i++;
    }
    return sb.toString();
  }
}
 */