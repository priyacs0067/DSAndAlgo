package myPackage.datastructure.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class ReverseAStackRecursive {

    static Stack<Integer> stack = new Stack<>();

    public static void reverseAStack(Stack<Integer> stack){
        if(!stack.isEmpty()){
            int temp = stack.pop();
            reverseAStack(stack);
            insertAtBottom(temp);
        }
    }

    private static void insertAtBottom(int temp) {
        if(stack.isEmpty()){
            stack.push(temp);
        }else {
            int item = stack.pop();
            insertAtBottom(temp);
            stack.push(item);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.println("**** Before Reversal****");
        System.out.println(st);

        reverseAStack(st);
        System.out.println("**** After Reversal*****");
        System.out.println(stack);
    }
}

