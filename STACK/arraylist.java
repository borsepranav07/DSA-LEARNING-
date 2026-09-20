import java.util.*;

public class arraylist {

    static class Stack {

        static ArrayList<Integer> list = new ArrayList<>();

        // Check if stack is empty
        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // Add element
        public static void push(int data) {
            list.add(data);
        }

        // Remove and return top element
        public static int pop() {

            if (isEmpty()) {
                return -1;
            }

            int top = list.get(list.size() - 1);

            list.remove(list.size() - 1);

            return top;
        }

        // Return top element without removing
        public static int peek() {

            if (isEmpty()) {
                return -1;
            }

            return list.get(list.size() - 1);
        }
    }

    public static void main(String args[]) {

        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}