package Queues;

import LinkedList.Node;

public class QueueAndLinkList {
    // Pointer to the front and the rear of the linked list
    Node front, rear;

    // Constructor to initialize the front and rear
    QueueAndLinkList() {
        front = rear = null;
    }

    // Function to check if the queue is empty
    boolean isEmpty() {
        // If the front and rear are null, then the queue is empty, otherwise it's not
        return front == null && rear == null;
    }

    // Function to add an element to the queue
    void enqueue(int new_data) {
        // Create a new linked list node
        Node new_node = new Node(new_data);

        // If queue is empty, the new node is both the front and rear
        //Kuyruk boşsa hem front hem rear yeni node'u gösterir
        if (rear == null) {
            front = rear = new_node;
            return;
        }

        // Add the new node at the end of the queue and change rear
        //
        rear.next = new_node;
        rear = new_node;
    }

    // Function to remove an element from the queue
    //Eleman çıkarma
    void dequeue() {
        // If queue is empty, return
        //Kuyruk boşsa "Queue Underflow" hatası verir
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return;
        }

        // Store previous front and move front one node ahead
        //Front'u bir sonraki node'a taşır
        front = front.next;

        // If front becomes null, then change rear also to null
        if (front == null) {
            rear = null;
        }
    }

    // Function to get the front element of the queue
    int getFront() {
        // Checking if the queue is empty
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        return front.data;
    }

    // Function to get the rear element of the queue
    int getRear() {
        // Checking if the queue is empty
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        return rear.data;
    }

    // Function to display all elements in the queue
    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        Node current = front;
        System.out.print("Queue elements: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Function to get the size of the queue
    int size() {
        int count = 0;
        Node current = front;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}