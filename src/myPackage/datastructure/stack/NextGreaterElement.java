package myPackage.datastructure.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

/* find the next element just greater than i, if it does not exist, return -1 */
// https://www.youtube.com/watch?v=sgelJuvX1bU&list=PLqM7alHXFySF7Lap-wi5qlaD8OEBx9RMV&index=7&ab_channel=GeeksforGeeks
public class NextGreaterElement {

    public static StackUsingLinkedList.StackNode stack;

    public static HashMap findNextGrElement(int[] a) {
        HashMap<Integer, Integer> nextGrElement = new HashMap<>();
        Deque<Integer> stack = new ArrayDeque();

        if (a == null || a.length == 0) {
            return null;
        }

        // push first element in stack
        stack.push(a[0]);

        for (int i=1 ; i <a.length ; i++) {
            int top;
            while(!stack.isEmpty()){
                top = stack.pop();
                if(a[i] > top){
                    nextGrElement.put(top,a[i]);
                }else {
                    stack.push(top);
                    break;
                }
            }
            stack.push(a[i]);
        }

        while (!stack.isEmpty()){
            nextGrElement.put(stack.pop(),-1);
        }
        return nextGrElement;
    }

    public static void main(String[] args) {
        int[] arr = {4,50,2,25,24,67,12,78};

        HashMap<Integer,Integer> result = findNextGrElement(arr);

        for(Integer key : result.keySet()){
            System.out.println(key + " -> "+result.get(key));
        }
    }

}