public class Solution {
    public boolean isSubsequence(String s, String t) {
        int sLen = s.length(), tLen = t.length();
        if(sLen == 0) return true;
        if(sLen > tLen) return false;
        
        Map<Character, TreeSet<Integer>> map = new HashMap<>();
        for(int i = 0; i < tLen; i++) {
            char c = t.charAt(i);
            if(!map.containsKey(c)) map.put(c, new TreeSet<Integer>());
            map.get(c).add(i);
        }
        
        int lowerIndex = -1;
        for(int j = 0; j < sLen; j++) {
            char c = s.charAt(j);
            if(!map.containsKey(c)) return false;
            
            Integer index = map.get(c).higher(lowerIndex);
            if(index == null) return false;
            lowerIndex = index;
        }
        
        return true;
    }
}