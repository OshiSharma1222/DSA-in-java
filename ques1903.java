class Solution {
    public String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            char c = num.charAt(i);
            if ((c - '0') % 2 == 1) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}
public class ques1903 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String num = "52";
        String result = sol.largestOddNumber(num);
        System.out.println(result);
    }
}
