package myPackage.datastructure.stack;

import java.util.Stack;

public class LongestValidParanthesisSubstring {

    public static final Character OPEN_PARA = '(';
    public static final Character CLOSED_PARA = ')';

    public static int validParanthesisSubstr(String str){
        int result = 0;
        Stack<Character> stack = new Stack<>();
        char[] cArray = str.toCharArray();
        for(char ch :cArray) {
            if(ch == OPEN_PARA){
                stack.push(ch);
            }else if(ch == CLOSED_PARA && !stack.isEmpty()){
                char top = stack.pop();
                if(top == OPEN_PARA){
                    // valid str combination. Append to result
                    result +=2;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String str = ")()())))";
        System.out.println(validParanthesisSubstr(str));
    }
}
