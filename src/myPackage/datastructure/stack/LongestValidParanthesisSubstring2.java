package myPackage.datastructure.stack;

import javax.swing.plaf.PanelUI;
import java.security.PublicKey;
import java.util.Stack;

public class LongestValidParanthesisSubstring2 {
    // find if combination of () {} [] are balanced in an expression or not

    public static final  char OPEN_PARA = '(';
    public static final  char CLOSED_PARA = ')';

    public static final  char OPEN_CURLY = '{';
    public static final  char CLOSED_CURLY = '}';

    public static final char OPEN_SQ = '[';
    public static final char CLOSED_SQ = ']';

    public static boolean isBalanced(String str){

        Stack<Character> stack = new Stack<>();
        boolean isBalanced = false;

        char[] cArray = str.toCharArray();
        for(char c : cArray){
            if(isOpenBrace(c)){
                stack.push(c);
            }else if(isClosedBrace(c) && !stack.isEmpty()){
                char top = stack.pop();
                isBalanced = isBraceMatching(c, top);
            }else {
                return false;
            }
        }
        return isBalanced && stack.isEmpty();
    }

    private static boolean isOpenBrace(char c) {
        return (c == OPEN_SQ || c == OPEN_CURLY || c== OPEN_PARA);
    }

    private static boolean isClosedBrace(char c) {
        return (c == CLOSED_CURLY || c == CLOSED_SQ || c== CLOSED_PARA);
    }

    private static boolean isBraceMatching(char c, char top){
        return ((c == CLOSED_PARA && top == OPEN_PARA)
                || ( c == CLOSED_CURLY && top == OPEN_CURLY)
                || (c == CLOSED_SQ && top == OPEN_SQ));
    }

    public static void main(String[] args) {
        String str = "{}()[{()}"; //  imbalanced expression missing closed sq bracket
        System.out.println(" Is Balanced = " +isBalanced(str));
    }
}
