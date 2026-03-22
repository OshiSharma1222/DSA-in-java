// //remove outermost parentheses
class solution {
    public String removeOuterParentheses(String s){
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                if(count > 0){
                    sb.append(c);
                }
                count++;
            }else{
                count--;
                if(count > 0){
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}

class ques1021{
    public static void main(String[] args){
        solution sol = new solution();
        String s = "(()())())";
        String result = sol.removeOuterParentheses(s);
        System.out.println(result);
    }
}