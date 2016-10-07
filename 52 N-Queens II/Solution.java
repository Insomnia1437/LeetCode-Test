
/**
 Follow up for N-Queens problem.

 Now, instead outputting board configurations, return the total number of distinct solutions.
 */
public class Solution {
    public int totalNQueens(int n) {
        int a[]= new int[n];
        int i=0;
        int count=0;
        while (true){
            if (a[i]<n){
                if (isConflict(a,i)){
                    a[i]++;
                    continue;
                }
                if (i>=n-1){
                    count++;
                    a[n-1]++;
                    continue;
                }
                i++;
                continue;
            }else {
                a[i]=0;
                i--;
                if(i<0){
                    return count;
                }
                a[i]++;
                continue;
            }
        }

    }
    private boolean isConflict(int a[],int i){
        for (int j = 0; j < i; j++) {
            if (a[j] == a[i] || Math.abs(a[j]-a[i])==Math.abs(i-j)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.totalNQueens(8));
    }
}


