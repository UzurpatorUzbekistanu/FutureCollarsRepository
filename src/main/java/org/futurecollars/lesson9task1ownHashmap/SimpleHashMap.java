package org.futurecollars.lesson9task1ownHashmap;


public class SimpleHashMap implements OwnMap {
    private static final int INITIAL_CAPACITY = 16;
    private Entry[] table;
    private int size;

    public SimpleHashMap() {
        table = new Entry[INITIAL_CAPACITY];
        size = 0;
    }

    private static class Entry {
        final String key;
        String value;
        Entry next;

        Entry(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    @Override
    public boolean put(String key, String value) {
        int index = indexFor(hash(key));
        for (Entry e = table[index]; e != null; e = e.next) {
            if (e.key.equals(key)) {
                e.value = value;
                return true;
            }
        }
        addEntry(key, value, index);
        return true;
    }

    @Override
    public boolean containsKey(String key) {
        int index = indexFor(hash(key));
        for (Entry e = table[index]; e != null; e = e.next) {
            if (e.key.equals(key)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        for (Entry e : table) {
            for (Entry entry = e; entry != null; entry = entry.next) {
                if (entry.value.equals(value)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String remove(String key) {
        int index = indexFor(hash(key));
        Entry prev = table[index];
        Entry e = prev;

        while (e != null) {
            Entry next = e.next;
            if (e.key.equals(key)) {
                size--;
                if (prev == e) {
                    table[index] = next;
                } else {
                    prev.next = next;
                }
                return e.value;
            }
            prev = e;
            e = next;
        }

        return null;
    }

    @Override
    public String get(String key) {
        int index = indexFor(hash(key));
        for (Entry e = table[index]; e != null; e = e.next) {
            if (e.key.equals(key)) {
                return e.value;
            }
        }
        return null;
    }

    private void addEntry(String key, String value, int bucketIndex) {
        Entry e = table[bucketIndex];
        table[bucketIndex] = new Entry(key, value);
        table[bucketIndex].next = e;
        size++;
    }

    private int hash(String key) {
        return key == null ? 0 : key.hashCode();
    }

    private int indexFor(int hash) {
        return hash & (table.length - 1);
    }

    public int size() {
        return size;
    }
}

