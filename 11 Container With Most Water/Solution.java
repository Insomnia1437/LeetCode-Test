import java.util.*;

/**
 Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai).
 n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
 Find two lines, which together with x-axis forms a container, such that the container contains the most water.

 Note: You may not slant the container.
 */
public class Solution {
    public int maxArea(int[] height) {
        int max=0;
        for (int i=0,j=height.length-1;i<j;){
            int value = Math.min(height[j],height[i])*(j-i);
            max = max>value?max:value;
            if (height[i]<=height[j]) {
                i++;
                continue;
            }
            if (height[i]>height[j]) j--;
        }
        return max;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int test[] = {2,3,10,5,7,8,9};
        System.out.println(solution.maxArea(test));
    }
}


