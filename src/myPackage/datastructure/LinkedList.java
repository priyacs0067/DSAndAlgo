package myPackage.datastructure;

import java.util.Hashtable;

public class LinkedList {
    public static Node insertAtBeginning(Node head , Node newNode){

        if(head == null){
            head = newNode;
        }else{
            Node temp = head ;
            newNode.next = temp;
            head = newNode;
        }
        return head;
    }

    public static void main(String[] args) {
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);
        Node node5 = new Node(50);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(null);

        Node head = node1;

//        System.out.println("************INSERTION AT BEGINNING********");
//        Node newHead = insertAtBeginning(head, new Node(0));

//        System.out.println("************INSERTION AT END ********");
//        newHead = insertAtEnd(newHead, new Node(6));

//        System.out.println("************INSERTION AT MIDDLE********");
//        newHead = insertAtMidddle(newHead, 3, new Node(7));

//        newHead = deleteFromBeginning(newHead);

//        newHead = deleteFromEnd(newHead);

//            printList(newHead);

//        System.out.println("Nth node from end is "+nthNodeFromEnd(newHead, 3).data);

//        System.out.println(isNullTerminatedOrCyclic(head));

        Node newHead  = insertInSortedLL(head, new Node(5));
        printList(newHead);
    }

    public static Node insertAtEnd(Node head , Node newNode){

        if(head == null){
            head = newNode;
            return head;
        }
        Node currNode = head;
        while(currNode.next !=null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
        newNode.next = null;

        return head;
    }

    public static Node insertAtMidddle(Node head , int key, Node newNode){

        if(head == null){
            head = newNode;
            return head;
        }
        Node currNode = head;
        while(currNode.next != null && currNode.data !=key){
            currNode = currNode.next;
        }
        Node prevNode = currNode;
        currNode = currNode.next;
        prevNode.next = newNode;
        newNode.next = currNode;

        return head;
    }

    public static Node deleteFromBeginning(Node head){
        if(head == null){
            System.out.println("List is empty");
        }

        Node temp = head ;
        head = temp.next;
        temp.next = null;
        return head;
    }

    public static Node deleteFromEnd(Node head){

        if(head == null){
            System.out.println("List is empty");
        }

        Node temp = head;

        while(temp.next.next != null){
            temp = temp.next;
        }

        Node prevNode = temp ;
        prevNode.next = null;

        return head;
    }

    public static void printList(Node head){
        if(head == null){
            System.out.println("List is empty");
        }
        Node temp = head ;

        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static Node nthNodeFromEnd(Node head, int n){

        if(head == null){
            System.out.println("List is empty");
        }

        Node fast = head;
        Node slow = null;
        int count = 1;

        while(count<n){
            fast = fast.next;
            count++;
        }

        // when fast has reached nth node, initialise slow
        slow = head;
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
    // check whether a linked list is null terminated or curcular

    public static String isNullTerminatedOrCyclic(Node head) {

        System.out.println(" inside  isNullTerminatedOrCyclic ");

        if (head == null) {
            System.out.println("List is empty");
        }

        Hashtable<Integer, Node> table = new Hashtable<>();

        Node temp = head;

        while (temp.next != null) {

            System.out.println(" inside  while loop isNullTerminatedOrCyclic ");

            if (!table.containsKey(temp.next.data)) {
                table.put(temp.next.data, temp);
                temp = temp.next;
            } else {
                return "Cyclic at " + temp.next.data;
            }
        }
        return "Null terminated";

    }

    public static Node insertInSortedLL(Node head, Node newNode) {

        if (head == null) {
            head = newNode;
        }

        Node curr, prev;

        curr = head;
        prev = null;

        // condition to add in the beginning of list
        if (curr.data > newNode.data) {
            newNode.next = curr;
            head = newNode;
            return head;
        }
        // for the rest of the list

        while (curr != null && curr.data < newNode.data) {
                prev = curr;
                curr = curr.next;
        }

        newNode.next = curr;
        prev.next = newNode;

        return head;
    }

    public static Node reverseASinglyLinkedList(Node head){
        if(head == null){
            return null;
        }

        Node curr = head;
        Node prev = null;

        while(curr.next != null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head = prev ;

        return head;
    }
}
