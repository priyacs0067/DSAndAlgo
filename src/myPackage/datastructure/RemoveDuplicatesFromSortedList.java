package myPackage.datastructure;

public class RemoveDuplicatesFromSortedList {

    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return null;
        ListNode node = head;
        while (node.next != null){
            if(node.val == node.next.val){
                node.next = node.next.next;
            }
            if(node.next != null && node.next.val != node.val){
                node = node.next;
            }

        }
        return head;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1,null);
        ListNode n4 = new ListNode(1,n1);
        ListNode n5 = new ListNode(1,n4);

        ListNode result = deleteDuplicates(n5);

        while(result != null){
            System.out.print(result.val + " -> ");
            result = result.next;
        }
    }
}



class ListNode{

    int val;
    ListNode next;

    ListNode(){}
    ListNode(int val){ this.val = val;}
    ListNode(int val, ListNode next){this.val = val; this.next =next;}
}
