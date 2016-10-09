
/**
 Given an integer, write a function to determine if it is a power of two.
 */
public class Solution {
    public boolean isPowerOfTwo(int n) {
            double n_d = (double)n;
            while(n_d >= 2){
                n_d = n_d/2.0;
            }
            return n_d == 1.0;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPowerOfTwo(1025));
    }
}


