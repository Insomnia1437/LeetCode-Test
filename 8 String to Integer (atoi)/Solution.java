
/**
 Implement atoi to convert a string to an integer.
 */
public class Solution {
    public int myAtoi(String str) {
        int len = str.length();
        if (len==0)
            return 0;
        long res=0;
        int k=0,sign=1;
        while (str.charAt(k)==' '){
            k++;
        }
        if (str.charAt(k) == '-'){
            sign=-1;
            k++;
        }else if (str.charAt(k)=='+'){
            sign=1;
            k++;
        }
        String temp="";
        for (int i = k; i < len; i++) {
            if (isDigit(str.charAt(i))){
                temp+=str.charAt(i);
            }else
                break;
        }
        int l = temp.length()-1;
        for (int i = 0; i < temp.length(); i++) {
            res+=(temp.charAt(i)-48)*Math.pow(10,l);
            l--;
        }
        res*=sign;
        if (res>Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if (res<Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        return (int)res;
    }
    public boolean isDigit(char c){
        if (c>='0' || c<='9'){
            return true;
        }
        return false;
    }

    /*
        public int myAtoi(String str) {
        double result = 0;
        int POrN = 1;
        int count = 0;
        char[] charArr = str.toCharArray();
        for(char c:charArr){
            count ++;
            if( c >='0' && c <='9' ){
                result *= 10;
                result += ( c - '0');
            }else if( c == '-' && count == 1){
                POrN = -1;
            }else if( c == '+' && count == 1){
                POrN =  1;
            }else if( c == ' ' && count == 1){
                count --;
            }else{
                break;
            }

        }
        if( result > Integer.MAX_VALUE ){
            if(POrN == 1)
                return Integer.MAX_VALUE;
            else
                return Integer.MIN_VALUE;
        }else{
            return (int)(result * POrN);
        }
    }
     */
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.myAtoi("+1"));

    }
}


