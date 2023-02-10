package myPackage.datastructure;

public class ModularNodeFromEnd {

    public static void modularNodeFromEnd(Node head, int k){

        if(k ==0 || head == null){
            System.out.printf("NULL");
        }
        Node temp = head;
        Node modularNode = null;
        int count = 0;

        while(temp !=null){
            temp = temp.next;
            count++;
            if(count%k == 0){
                modularNode = temp;
            }
        }
        System.out.printf("Data " +modularNode.data);
    }

    // find n/k th element where n is the number of nodes in linked list. n is not given
    public static void fractionalNode(Node head, int k){

        if(k ==0 || head == null){
            System.out.printf("NULL");
        }

        Node temp = head;
        Node fractionalNode = null;
        int count = 0;

        while(temp !=null){
            temp = temp.next;
            count++;
            if(count%k == 0){
                fractionalNode = temp;
            }
        }
        System.out.printf("Data " +fractionalNode.data);
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

        modularNodeFromEnd(n1,4);

    }
}
