package myPackage.datastructure.stack;

import myPackage.datastructure.CommonUtils;
import myPackage.datastructure.Node;

import java.sql.SQLOutput;
import java.util.Stack;

public class StackUsingLinkedList {
    class StackNode {
        int data;
        StackNode next;
    }

    static StackNode top;

    StackUsingLinkedList(){
        this.top = null;
    }

    public void push(int data){
        StackNode node = new StackNode();
        node.data = data;
        node.next = top;

        top = node;
    }

    public StackNode pop(){
        StackNode temp = top;
        top = top.next;

        return temp;
    }

    public static void printStack(StackNode top){
        if (top == null){
            System.out.println("Empty Stack");
            return;

        }
        StackNode temp = top;
        while(temp != null){
            System.out.printf(temp.data +"->");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {

        StackUsingLinkedList obj = new StackUsingLinkedList();

        System.out.printf("******* Printing Stack ****** ");
        printStack(top);

        System.out.println("****** Push *******");

        obj.push(5);
        obj.push(4);
        obj.push(3);
        obj.push(2);
        obj.push(1);
        printStack(top);

        System.out.println("****** Pop *******");
        System.out.println(obj.pop().data);

        printStack(top);
    }

}
