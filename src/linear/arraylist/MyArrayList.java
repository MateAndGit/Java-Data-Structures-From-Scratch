package linear.arraylist;

import java.util.Arrays;

public class MyArrayList<T> {

    private static final int DEFAULT_CAPACITY = 10;
    private Object[] data;
    private int size;

    public MyArrayList(int capacity) {
        this.data = new Object[capacity];
    }

    public MyArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public void add(T element) {
        if (size == data.length) {
            resize();
        }
        data[size++] = element;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index >= size || index < 0) throw new IndexOutOfBoundsException();
        return (T) data[index];
    }

    public int size() {
        return size;
    }

    public void remove(int index) {
        if (index >= size || index < 0) throw new IndexOutOfBoundsException();

        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }

        data[size -1] = null;
        size--;
    }

    private void resize() {
        int oldCapacity = data.length;
        int newCapacity = oldCapacity * 2;

        data = Arrays.copyOf(data, newCapacity);
        System.out.println("배열 확장! " + oldCapacity + " -> " + newCapacity);
    }

}