class Node {
    int data ;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}




public class using_head {



    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);





        head.next = second;
        second.next = third;
        third.next = fourth;


        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);
        System.out.println(head.next.next.next.data);



    }
    
}
