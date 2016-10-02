import java.util.*;

/**
 Given a non-empty array of integers, return the k most frequent elements.

 For example,
 Given [1,1,1,2,2,3] and k = 2, return [1,2].

 Note:
 You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
 Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 */
public class Solution {

    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else
                map.put(nums[i],map.get(nums[i])+1);
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        int count = 1;
        for (Map.Entry<Integer,Integer> temp : list){
            if (count>k)
                break;
            res.add(temp.getKey());
            count++;
        }
        return res;
    }




    public static void main(String[] args) {
        Solution solution = new Solution();
        int a[]={1,1,1,2,2,3};
        System.out.println(solution.topKFrequent(a,2));

    }
}


