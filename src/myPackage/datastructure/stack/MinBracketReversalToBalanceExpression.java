package myPackage.datastructure.stack;

import java.util.Stack;

public class MinBracketReversalToBalanceExpression {

    public static int minReversalToBalanceExpr(String str){
        Stack<Character> stack = new Stack<>();
        char[] charArray = str.toCharArray();
        for(char c: charArray){
            if(c == '{')
                stack.push(c);
            else if(!stack.isEmpty()){
                char top = stack.peek();
                if(top == '}')
                    stack.pop();
                else stack.push(c);
            }
        }
        int reducedLen = stack.size();
        int n=0;

        while (!stack.isEmpty() && stack.peek() == '{'){
            stack.pop();
            n++;
        }

        return (reducedLen/2 + n%2);
    }

    public static void main(String[] args) {
        String str = "}{}{";
        System.out.println("Min Reversal "+minReversalToBalanceExpr(str));
    }
}
