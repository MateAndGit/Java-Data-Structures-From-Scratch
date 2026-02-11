package linear.stringbuilder;

import java.util.Arrays;

public class MyStringBuilder<T> {
    private T[] buffer;
    private int size;
    private int capacity;

    @SuppressWarnings("unchecked")
    public MyStringBuilder() {
        this.capacity = 16;
        this.buffer = (T[]) new Object[this.capacity];
        this.size = 0;
    }

    public void append(T value) {
        if (size == capacity) {
            resize();
        }
        buffer[size++] = value;
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        capacity = capacity * 2;
        buffer = Arrays.copyOf(buffer, capacity);
    }

    public T charAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return buffer[index];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(buffer[i]);
        }
        return sb.toString();
    }

    public int length() {
        return size;
    }
}