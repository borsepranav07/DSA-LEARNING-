class Node {
    int data ;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}



public class basic {

    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);





        first.next = second;
        second.next = third;
        third.next = fourth;


        System.out.println(first.data);
        System.out.println(first.next.data);
        System.out.println(first.next.next.data);
        System.out.println(first.next.next.next.data);








    }


}
