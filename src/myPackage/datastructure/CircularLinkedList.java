package myPackage.datastructure;

public class CircularLinkedList {

    public static void main(String[] args) {

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(node1);

        System.out.println("Number of nodes = "+countNodesInACLL(node1));

        System.out.println("Deleting at start of list");
        printCLL(deleteAtStartOfCLL(node1));
    }

    public static int countNodesInACLL(Node head){
        if(head == null){
            System.out.println("List empty");
        }

        Node curr = head;
        int count = 1;
        while(curr.next != head){
            count++;
            curr = curr.next;
        }
        return count;
    }

    public static Node deleteAtStartOfCLL(Node head){

        if(head == null){
            System.out.println("List empty");
        }

        Node currNode = head ;
        while(currNode.next != head){
            currNode = currNode.next;
        }

        Node prevNode = currNode;
        currNode = currNode.next ;  // should be pointing at head now
        prevNode.next = currNode.next;
        currNode.next = null;
        head = prevNode.next;

        return head;
    }

    public static void printCLL(Node head){
        if(head == null){
            System.out.println("List is empty");
        }
        Node temp = head ;

        do{
            System.out.println(temp.data);
            temp = temp.next;
        }while (temp != head);
    }
}
