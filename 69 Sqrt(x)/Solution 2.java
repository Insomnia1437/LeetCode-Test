
/**
 Implement int sqrt(int x).

 Compute and return the square root of x.
 */
public class Solution {
    public int mySqrt(int x) {
        int lo=1,hi=x;
        while (lo<hi){
            int mid = lo+(hi-lo)/2+1;
            if (mid > x/mid){
                hi=mid-1;
            }else
                lo=mid;
        }
        return hi;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int a[]={4,2,0,0,1,1,4,4,4,0,4,0};
//        int a[]={9,9};
        System.out.println(solution.mySqrt(16));
    }
}


