package linear.linkedlist.doubly;

class Node {
    int data;
    Node prev, next;
    Node(int data) {
        this.data = data;
    }
}

public class DoublyLinkedList {
    Node head, tail;

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void deleteFromHead() {
        if (head == null) return;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void deleteFromTail() {
        if (tail == null) return;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public boolean searchFromHead(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) return true;
            current = current.next;
        }
        return false;
    }

    public boolean searchFromTail(int key) {
        Node current = tail;
        while (current != null) {
            if (current.data == key) return true;
            current = current.prev;
        }
        return false;
    }

    public void traverseForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void traverseBackward() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " <- ");
            current = current.prev;
        }
        System.out.println("null");
    }
}

