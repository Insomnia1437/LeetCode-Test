import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 Given two words (beginWord and endWord), and a dictionary's word list, find the length of shortest transformation sequence from beginWord to endWord, such that:

 Only one letter can be changed at a time.
 Each transformed word must exist in the word list. Note that beginWord is not a transformed word.
 For example,

 Given:
 beginWord = "hit"
 endWord = "cog"
 wordList = ["hot","dot","dog","lot","log","cog"]
 As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
 return its length 5.

 Note:
 Return 0 if there is no such transformation sequence.
 All words have the same length.
 All words contain only lowercase alphabetic characters.
 You may assume no duplicates in the word list.
 You may assume beginWord and endWord are non-empty and are not the same.
 UPDATE (2017/1/20):
 The wordList parameter had been changed to a list of strings (instead of a set of strings). Please reload the code definition to get the latest changes.

 Subscribe to see which companies asked this question.
 **
 */
public class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> s = new HashSet<>();
        Set<String> wl = new HashSet<>(wordList);
        s.add(beginWord);
        if (!wl.contains(endWord)) return 0;
        wl.add(endWord);
        int dist = 1;
        while (!s.contains(endWord)){
            Set<String> u = new HashSet<>();
            for (String str: s){
                for (int i = 0; i < str.length(); i++) {
                    char[] chars = str.toCharArray();
                    for (char ch = 'a'; ch <= 'z'; ch++) {
                        chars[i] = ch;
                        String word = new String(chars);
                        if (wl.contains(word)) {
                            u.add(word);
                            wl.remove(word);
                        }
                    }
                    
                }
            }
            dist++;
            if (u.size() == 0) return 0;
            s = u;
        }
        return dist;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> wordlist = new ArrayList<String>(){
            {
                add("hot");
                add("dot");
                add("dog");
                add("lot");
                add("log");
            }
        };
        System.out.println(solution.ladderLength("hit","cog",wordlist));
    }
}


