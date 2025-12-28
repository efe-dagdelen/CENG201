package Stack;

public class StackUsingLinkedlist {

    // A linked list node
    private class Node {
        int data; // integer data
        Node link; // reference variable Node type

        // Constructor for Node
        Node(int data) {
            this.data = data;
            this.link = null;
        }
    }

    // create global top reference variable
    private Node top;

    // Constructor
    public StackUsingLinkedlist() {
        this.top = null;
    }

    // Utility function to add an element x in the stack
    public void push(int x) {
        // create new node temp and allocate memory
        Node temp = new Node(x);

        // put top reference into temp link
        temp.link = top;

        // update top reference
        top = temp;
    }

    // Utility function to check if the stack is empty or not
    public boolean isEmpty() {
        return top == null;
    }

    // Utility function to return top element in a stack
    public int peek() {
        // check for empty stack
        if (!isEmpty()) {
            return top.data;
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    // Utility function to pop top element from the stack
    public int pop() {
        // check for stack underflow
        if (top == null) {
            System.out.print("\nStack Underflow");
            return -1;
        }

        // get the data from top node
        int data = top.data;

        // update the top pointer to point to the next node
        top = top.link;

        return data;
    }

    // Display all elements in the stack
    public void display() {
        // check for stack underflow
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }

        Node temp = top;
        while (temp != null) {
            // print node data
            System.out.print(temp.data);

            // assign temp link to temp
            temp = temp.link;

            if(temp != null)
                System.out.print(" -> ");
        }
        System.out.println();
    }

    // Get the size of the stack
    public int size() {
        int count = 0;
        Node temp = top;
        while (temp != null) {
            count++;
            temp = temp.link;
        }
        return count;
    }

    // Main method for testing
    public static void main(String[] args) {
        StackUsingLinkedlist stack = new StackUsingLinkedlist();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.print("Stack elements: ");
        stack.display(); // Output: 30 -> 20 -> 10

        System.out.println("Top element: " + stack.peek()); // Output: 30

        System.out.println("Popped: " + stack.pop()); // Output: 30
        System.out.println("Popped: " + stack.pop()); // Output: 20

        System.out.print("Stack after popping: ");
        stack.display(); // Output: 10

        System.out.println("Stack size: " + stack.size()); // Output: 1
        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false
    }
}
