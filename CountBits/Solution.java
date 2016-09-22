import java.lang.Math;

/**
 * Created by control on 2016/9/8.
 */
public class Solution {
    public int[] countBits(int num) {
        int a[] = new int[num + 1];
        if (num == 0) {
            a[0] = 0;
            return a;
        }
        a[0] = 0;
        a[1] = 1;

        int k = 1, i = 2;
        int temp;
        while (i <= num) {
            temp = (int) Math.pow(2, k - 1);
            for (i = (int) Math.pow(2, k); i < Math.pow(2, k + 1); i++) {
                int t = ((int) Math.pow(2, k + 1) - 1 - (int) Math.pow(2, k)) / 2 + (int) Math.pow(2, k);
                if (i <= num) {
                    if (i <= t) {
                        a[i] = a[temp++];
                    } else {
                        a[i] = a[temp++] + 1;
                    }
                } else
                    break;

            }
            k++;

        }

        return a;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        int res[];
        res = s.countBits(2);
        for (int i = 0; i < res.length; i++) {
            System.out.println(i + ":" + res[i]);
        }
}
}
