package myPackage.datastructure;

public class JosepheusCirlce {


    // TODO:  This code needs to be corrected.
    public static void getJosepheusCirlce(int N, int M){

        Node p = new Node(1);
//        p.next = p;
        Node q = p;

        // create circular linked list
        for(int i = 2; i <= N ; ++i){
            p = p.getNext();
            p.setData(i);
        }
        p.setNext(q);

        // eliminate M-th player as long as only one player remains
        for(int count = N; count>1; --count){
            for(int i = 0; i <M-1;++i){
                p = p.getNext();
                p.setNext(p.getNext().getNext());
            }
        }
        System.out.printf("Last node remaining is "+p.getData());
    }

    public static void main(String[] args) {
        getJosepheusCirlce(12,3);
    }
}
