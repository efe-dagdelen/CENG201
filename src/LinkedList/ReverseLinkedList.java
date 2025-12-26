package LinkedList;

public class ReverseLinkedList {
    static Node reverse(Node head) {
        Node next = null;
        Node current = head;
        Node prev = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }


}