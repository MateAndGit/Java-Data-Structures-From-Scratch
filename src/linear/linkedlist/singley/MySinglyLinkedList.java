package linear.linkedlist.singley;

public class MySinglyLinkedList<T> {

    // 1. 데이터를 담는 상자 (Node)
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> head; // 리스트의 시작 노드
    private int size;     // 리스트의 크기

    public MySinglyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    // 2. 리스트의 맨 끝에 데이터 추가
    public void add(T data) {
            Node<T> newNode = new Node<>(data);

            if (head == null) {
                head = newNode;
            } else {
                Node<T> current = head;

                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
            size++;
    }

    // 3. 특정 인덱스의 데이터 가져오기 (배열과 비교 필수!)
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
        }
        Node<T> current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.data;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
        }
        if (index == 0) {
            head = head.next;
        }
        else {
            Node<T> prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }
            prev.next = prev.next.next;
        }
        size--;
    }
    public int size() {
        return size;
    }
}