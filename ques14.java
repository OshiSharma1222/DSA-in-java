import java.util.Arrays;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        String st = new String();
        int i=0;
        String st2 = strs[0];
        String st1 = strs[strs.length-1];
        while(st1.length() <st2.length() && st1.length()>st2.length()){
        if(st2.charAt(i)==st1.charAt(i)){
            st = st2.substring(0, i + 1);
            i++;
        }
        }
        return st;
    }
}
public class ques14 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] strs = {"flower","flow","flight"};
        String result = sol.longestCommonPrefix(strs);
        System.out.println(result);
    }
}