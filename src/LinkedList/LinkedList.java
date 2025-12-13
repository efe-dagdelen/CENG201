package LinkedList;

public class LinkedList {
    Node head;      //

    public LinkedList() {
        head = null;
    }


    public void append(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = n;
    }


    public void prepend(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }


    public void delete(int key) {
        if (head == null) return;


        if (head.data == key) {
            head = head.next;
            return;
        }

        Node current = head;
        Node prev = null;
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        if (current == null) return; // Bulunamadı
        prev.next = current.next;
    }


    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
