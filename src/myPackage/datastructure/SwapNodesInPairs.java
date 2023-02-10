package myPackage.datastructure;

public class SwapNodesInPairs {

    public static Node swapPairs(Node head){

        if(head == null || head.next == null)
            return head;

        Node first = head ;
        Node second = head.next;

        first.next = swapPairs(head.next.next);
        second.next = first;

        return second;
    }
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        n5.setNext(n6);
        n6.setNext(n7);
        n7.setNext(null);

        Node head = n1;
        System.out.printf("Before Swap ");
        CommonUtils.printLL(head);
        Node swaped = swapPairs(head);
        System.out.printf("After Swap ");
        CommonUtils.printLL(swaped);
    }
}
