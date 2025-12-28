package Queues;

public class TestQueuAndLinkList {

    public static void main(String[] args) {
        QueueAndLinkList queue = new QueueAndLinkList();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.display(); // Queue elements: 10 20 30

        System.out.println("Front: " + queue.getFront()); // Front: 10
        System.out.println("Rear: " + queue.getRear());   // Rear: 30

        queue.dequeue();
        queue.display(); // Queue elements: 20 30

        System.out.println("Size: " + queue.size()); // Size: 2
    }
}