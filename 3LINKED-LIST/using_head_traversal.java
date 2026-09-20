class Node {
    int data ;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}




public class using_head_traversal {



    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);





        head.next = second;
        second.next = third;
        third.next = fourth;

        Node Current = head;

        while(Current != null) {
            System.err.println(Current.data);

            Current = Current.next;
        }
        


    }
    
}
