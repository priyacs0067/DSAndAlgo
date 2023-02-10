package myPackage.datastructure;

public class CommonUtils {

    public static void printArray(int[] arr){
        for (int i:arr) {
            System.out.println(i +" ");
        }
    }

    public static void printLL(Node head){
        if (head == null)
            System.out.printf("Empty List");

        Node temp = head;
        while(temp.next != null){
            System.out.printf(temp.data +"->");
            temp = temp.next;
        }
    }

}
