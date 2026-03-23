//Reverse words in a String
import java.util.Scanner;
class Solution {
    public static String reverseWords(String s){
        String[] word = s.trim().split("\\s+"); // splits on one or more spaces, removes extra spaces between words
        StringBuilder sb = new StringBuilder();
        for(int w = word.length - 1; w >= 0; w--){
            sb.append(word[w]);
            if(w != 0){
                sb.append(" ");
            }

        }
        return sb.toString();
    }
}
public class ques151 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = Solution.reverseWords(s);
        System.out.println(result);
    }
}