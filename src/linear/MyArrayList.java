package linear;

public class MyArrayList {
    private Object[] data;
    private int size;

    public MyArrayList(int capacity) {
       this.data = new Object[capacity];
        this.size = 0;
    }
}
