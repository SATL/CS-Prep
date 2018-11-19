package datastructures;

public class Stack {
    private static class Node {
        private int data;
        private Node next;

        private Node(int data) {
            this.data = data;
        }
    }

    private Node top;

    public boolean isEmpty() {
        return top == null;
    }

    ;

    public int peek() throws Exception {
        if (top == null) {
            throw new Exception("No data in stack");
        }
        return top.data;
    }

    public void push(int data) {
        Node node = new Node(data);
        node.next = top;
        top = node;
    }

    public int pop() throws Exception {
        if (top == null)
            throw new Exception("No data in stack");
        int data = top.data;
        top = top.next;
        return data;
    }
}
