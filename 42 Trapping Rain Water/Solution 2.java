import java.util.Stack;

/**
 Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.

 For example,
 Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.


 The above elevation map is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped. Thanks Marcos for contributing this image!
 */
public class Solution {
    public int trap(int[] height) {
        int res=0;
        int right=height.length-1;
        int maxBotWater=0;
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i <= right;) {
            if (s.isEmpty() || height[i]<height[s.peek()]){
                s.push(i++);
            }else {
                int bot = s.pop();
                maxBotWater = s.isEmpty()?0:(Math.min(height[i],height[s.peek()])-height[bot])*(i-s.peek()-1);
                res+=maxBotWater;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int a[] = {0,1,0,2,1,0,1,3,2,1,2,1};

        System.out.println(solution.trap(a));

    }
}


