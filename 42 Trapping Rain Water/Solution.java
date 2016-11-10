
/**
 Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.

 For example,
 Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.


 The above elevation map is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped. Thanks Marcos for contributing this image!
 */
public class Solution {
    public int trap(int[] height) {
        int res=0;
        int left=0,right=height.length-1;
        int maxleft=0,maxright=0;
        while (left<=right){
            if (maxleft<=maxright){
                if (height[left]>maxleft) maxleft=height[left];
                else {
                    res+=maxleft-height[left];
                }
                left++;
            }else {
                if (height[right]>maxright) maxright=height[right];
                else {
                    res+=maxright-height[right];
                }
                right--;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int a[] = {2,0,2};

        System.out.println(solution.trap(a));

    }
}


