import java.lang.reflect.Array;
import java.util.*;

/**
 Given an array of strings, group anagrams together.

 For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"],
 Return:

 [
 ["ate", "eat","tea"],
 ["nat","tan"],
 ["bat"]
 ]
 Note: All inputs will be in lower-case.
 */
public class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res =new LinkedList<>();
        Map<String, Integer> map = new HashMap<>();
        int count=0;
        for (String s:strs){
            char ch[] = s.toCharArray();
            Arrays.sort(ch);
            String ele = String.valueOf(ch);
            List<String > temp = new LinkedList<>();
            temp.clear();
            if (!map.containsKey(ele)){
                map.put(ele,count);
                temp.add(s);
                res.add(count,temp);
                count++;
            }else {
                int t = map.get(ele);
                res.get(t).add(s);
            }
        }
        return res;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        List<List<String>> lists = new LinkedList<>();
        String a[] = {"eat", "tea", "tan", "ate", "nat", "bat"};

        lists = s.groupAnagrams(a);

        for (int i = 0; i < lists.size(); i++) {
            for (int j = 0; j < lists.get(i).size(); j++) {
                System.out.print(lists.get(i).get(j)+" ");
            }
            System.out.println();
        }


    }
}


/*
other's solution


public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<List<String>>();
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        Arrays.sort(strs);
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String keyStr = String.valueOf(ca);
            if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<String>());
            map.get(keyStr).add(s);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
 */
