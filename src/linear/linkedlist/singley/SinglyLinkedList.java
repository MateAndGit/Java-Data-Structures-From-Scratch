package linear.linkedlist.singley;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {
    Node head;

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtPosition(int data, int position) {
        if (position == 0) {
            insertAtHead(data);
            return;
        }
        Node newNode = new Node(data);
        Node current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) return;
        newNode.next = current.next;
        current.next = newNode;
    }

    public void delete(int key) {
        Node current = head, prev = null;
        while (current != null) {
            if (current.data == key) {
                if (prev != null) {
                    prev.next = current.next;
                } else {
                    head = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    public boolean search(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) return true;
            current = current.next;
        }
        return false;
    }

    public void traverse() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}