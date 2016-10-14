
/**
 Determine whether an integer is a palindrome. Do this without extra space.

 click to show spoilers.

 Some hints:
 Could negative integers be palindromes? (ie, -1)

 If you are thinking of converting the integer to string, note the restriction of using extra space.

 You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", you know that the reversed integer might overflow. How would you handle such case?

 There is a more generic way of solving this problem.
 */
public class Solution {
    /*
    每次通过除以10和对10取余来保存下前半部分x和后半部分v，比如 x = 123432, v=1;
    直到x=123，v=1234的时候，循环结束，再通过 v/10 == x，来判断数是不是回环的。     */
    public boolean isPalindrome(int x) {
        if (x<0) return isPalindrome(-1*x);
        if (x<10) return true;
        if (x%10==0) return false;
        int v=x%10;
        x=x/10;
        while (x>v){
            v=v*10+x%10;
            x=x/10;
        }
        if (v>x)v/=10;
        return x==v?true:false;

    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(0));

    }
}


