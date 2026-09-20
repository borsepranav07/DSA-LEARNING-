class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class middle_insertion {

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(40);

        // Create new node
        Node newNode = new Node(30);

        // Move to node 20
        Node current = head;

        while (current.data != 20) {
            current = current.next;
        }

        // Insert 30 after 20
        newNode.next = current.next;
        current.next = newNode;

        // Print
        current = head;

        while (current != null) {

            System.out.print(current.data + " ");

            current = current.next;
        }
    }
}