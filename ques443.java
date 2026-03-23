// 443. String Compression
class Solution {
    public int compress(char[] chars) {
        int index = 0;
        int i = 0;
        int n = chars.length;
        while (i < n) {
            char curr = chars[i];
            int count = 0;
            while (i < n && chars[i] == curr) {
                i++;
                count++;
            }
            chars[index++] = curr;
            if (count > 1) {
                String st = Integer.toString(count);//
                for (char ch : st.toCharArray()) {
                    chars[index++] = ch;
                }
            }
        }
        return index;
    }
}
public class ques443 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        char[] chars = {'a','a','b','b','c','c','c'};
        int result = sol.compress(chars);
        System.out.println(result);
    }
}