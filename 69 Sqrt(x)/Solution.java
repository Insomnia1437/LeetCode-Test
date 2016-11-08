
/**
 Implement int sqrt(int x).

 Compute and return the square root of x.
 */
public class Solution {
    public int mySqrt(int x) {
        double k=1.0;
        while (Math.abs(k*k-x)>1e-5){
            k=0.5*(k+x/k);
        }
        return (int)k;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int a[]={4,2,0,0,1,1,4,4,4,0,4,0};
//        int a[]={9,9};
        System.out.println(solution.mySqrt(0));
    }
}


