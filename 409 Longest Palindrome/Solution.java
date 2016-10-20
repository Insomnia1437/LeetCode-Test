public class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[Math.abs('A' - 'z')+1];
        int ans = 0;
        for(int i = 0; i< s.length(); i++) count[s.charAt(i) - 'A']++; 
        for(int n: count) ans += n/2;
        return Math.min(ans*2+1, s.length());
    }
}