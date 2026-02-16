package nonlinear.hashtable;

import java.util.*;

public class HashMapChaining {
    private static class Entry {
        String key;
        int value;
        Entry(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private List<Entry>[] table;
    private int size;

    @SuppressWarnings("unchecked")
    public HashMapChaining(int size) {
        this.size = size;
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hash(String key) {
        return Math.abs(key.hashCode()) % size;
    }

    public void put(String key, int value) {
        int index = hash(key);
        for (Entry e : table[index]) {
            if (e.key.equals(key)) {
                e.value = value; // Update
                return;
            }
        }
        table[index].add(new Entry(key, value)); // Insert
    }

    public Integer get(String key) {
        int index = hash(key);
        for (Entry e : table[index]) {
            if (e.key.equals(key)) {
                return e.value;
            }
        }
        return null;
    }

    public void remove(String key) {
        int index = hash(key);
        Iterator<Entry> it = table[index].iterator();
        while (it.hasNext()) {
            if (it.next().key.equals(key)) {
                it.remove();
                return;
            }
        }
    }

    public static void main(String[] args) {
        HashMapChaining hm = new HashMapChaining(5);

        hm.put("apple", 10);
        hm.put("banana", 20);
        hm.put("apple", 30);
        System.out.println(hm.get("apple"));  // 30

        hm.remove("banana");
        System.out.println(hm.get("banana")); // null
    }
}
