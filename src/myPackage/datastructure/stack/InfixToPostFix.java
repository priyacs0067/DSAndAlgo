package myPackage.datastructure.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class InfixToPostFix {

    static int Precedence(char ch){
        switch (ch){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    static String infixToPostFix(String exp) {

        String result = new String("");

        Deque<Character> stack = new ArrayDeque<Character>();

        for (int i = 0; i < exp.length(); ++i) {
            char c = exp.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                result += c;

            } else if (c == '(') {
                stack.push(c);

            } else if (c == ')') {
                while (!stack.isEmpty()
                        && stack.peek() != '(') {
                    result += stack.peek();
                    stack.pop();
                }
                stack.pop();
            } else { // an operator is encountered
                while (!stack.isEmpty()
                        && Precedence(c) <= Precedence(stack.peek())) {
                    result += stack.peek();
                    stack.pop();
                }
                stack.push(c);
            }
        }
        // pop all the operators from the stack
        while (!stack.isEmpty()) {
            if (stack.peek() == '(')
                return "Invalid Expression";
            result += stack.peek();
            stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(infixToPostFix("(A+B)*(D/E)+(F-G)"));
    }
}
