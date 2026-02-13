package linear.linkedlist.singley;

public class main {

    public static void main(String[] args) {

        SinglyLinkedList ll = new SinglyLinkedList();

        ll.insertAtHead(17);
        ll.insertAtHead(18);
        ll.insertAtHead(19);
        ll.insertAtHead(76);
        ll.insertAtHead(44);

        ll.insertAtPosition(34, 3);

        ll.delete(18);

        System.out.println(ll.search(19)); // true

        ll.traverse();
        // 44 -> 76 -> 19 -> 34 -> 17 -> null
    }
}
