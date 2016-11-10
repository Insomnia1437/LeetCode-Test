import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 The set [1,2,3,…,n] contains a total of n! unique permutations.

 By listing and labeling all of the permutations in order,
 We get the following sequence (ie, for n = 3):

 "123"
 "132"
 "213"
 "231"
 "312"
 "321"
 Given n and k, return the kth permutation sequence.

 Note: Given n will be between 1 and 9 inclusive.
 */
public class Solution {
    public String getPermutation(int n, int k) {
        int factorial = 1;
        k--;
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(i+1);
            factorial*=(i+1);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            factorial = factorial/(n-i);
            int idx = k/factorial;
            sb.append(nums.get(idx));
            nums.remove(idx);
            k=k%factorial;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int a[] = {0,1,0,2,1,0,1,3,2,1,2,1};

        System.out.println(solution.getPermutation(3,4));

    }
}


