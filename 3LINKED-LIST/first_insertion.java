class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class first_insertion {

    public static void main(String[] args) {

        Node head = new Node(10);

        head.next = new Node(20);
        head.next.next = new Node(30);

        // Create new node
        Node newNode = new Node(5);

        // Connect new node to old head
        newNode.next = head;

        // Make new node the head
        head = newNode;

        // Print list
        Node current = head;

        while (current != null) {

            System.out.print(current.data + " ");

            current = current.next;
        }
    }
}