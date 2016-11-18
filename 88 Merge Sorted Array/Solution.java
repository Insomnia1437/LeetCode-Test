
/**
 Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

 Note:
 You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 The number of elements initialized in nums1 and nums2 are m and n respectively.
 */
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0,k=0;
        int temp[] = new int[m+n];
        while (i<m && j<n){
            if (nums1[i] < nums2[j])
                temp[k++] = nums1[i++];
            else
                temp[k++] = nums2[j++];
        }
        while (i<m){
            temp[k++] = nums1[i++];
        }
        while (j<n){
            temp[k++] = nums2[j++];
        }
        i=0;
        for (int num:temp)
            nums1[i++]=num;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int a[] = {0};
        int b[] = {1};

        solution.merge(a,0,b,1);
//        for (int i:a)
//            System.out.println(i);

    }
}


