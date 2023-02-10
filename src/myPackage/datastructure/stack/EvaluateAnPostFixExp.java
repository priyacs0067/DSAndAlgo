package myPackage.datastructure.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class EvaluateAnPostFixExp {

    public static int evaluatePostFixExp(String exp){

        Deque<Integer> stack = new ArrayDeque<Integer>();

        for(int i = 0; i < exp.length() ;++i){
             char c = exp.charAt(i);

             if(Character.isDigit(c)){
                 stack.push(c -'0');
             }else {
                 if(c == '+'){
                     int val1 = stack.pop();
                     int val2 = stack.pop();
                     stack.push(val2 + val1);
                 }else if(c =='-'){
                     int val1 = stack.pop();
                     int val2 = stack.pop();
                     stack.push(val2 - val1);
                 }else if(c =='*'){
                     int val1 = stack.pop();
                     int val2 = stack.pop();
                     stack.push(val2 * val1);
                 }else if(c =='/'){
                     int val1 = stack.pop();
                     int val2 = stack.pop();
                     stack.push(val2 / val1);
                 } else if(c =='^'){
                     int val1 = stack.pop();
                     int val2 = stack.pop();
                     stack.push((int)Math.pow(val2,val1));
                 }
             }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String exp="231*+9-";
        System.out.println("postfix eval = "+evaluatePostFixExp(exp));
    }
}
