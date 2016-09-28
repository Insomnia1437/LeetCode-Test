
/**
 The count-and-say sequence is the sequence of integers beginning as follows:
 1, 11, 21, 1211, 111221, ...

 1 is read off as "one 1" or 11.
 11 is read off as "two 1s" or 21.
 21 is read off as "one 2, then one 1" or 1211.
 Given an integer n, generate the nth sequence.

 Note: The sequence of integers will be represented as a string.
 */
public class Solution {
    public String countAndSay(int n) {
        StringBuilder res= new StringBuilder();
        if (n==1)
            return "1";
        else {
            String temp = countAndSay(n-1);
            int i=0,count=1;
            while (i<temp.length()){
                if (i==temp.length()-1)
                    break;
                if (temp.charAt(i) == temp.charAt(i+1)){
                    count++;
                }else{
                    res.append(count);
                    res.append(temp.charAt(i));
                    count=1;
                }
                i++;
            }
            res.append(count);
            res.append(temp.charAt(i));
        }
        return res.toString();
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        String res;
        res=s.countAndSay(6);
        System.out.println(res);
    }
}
/*
other's 2ms version
public String countAndSay(int n) {
    if(n==1) return "1";
    String str=countAndSay(n-1);
    char[] chs=str.toCharArray();
    StringBuilder sb=new StringBuilder();
    int num=1,len=chs.length;
    for(int i=0;i<len;i++){
        while(i+1<len&&chs[i]==chs[i+1]){
            num++;
            i++;
        }
        sb.append(num).append(chs[i]);
        num=1;
    }
    return sb.toString();
}
 */