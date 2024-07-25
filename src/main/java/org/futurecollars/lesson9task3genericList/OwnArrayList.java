package org.futurecollars.lesson9task3genericList;

import java.util.Arrays;

public class OwnArrayList<E> implements OwnList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private E[] elements;
    private int size = 0;

    @SuppressWarnings("unchecked")
    public OwnArrayList() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    @Override
    public boolean add(E e) {
        ensureCapacity();
        elements[size++] = e;
        return true;
    }

    @Override
    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return elements[index];
    }

    @Override
    public boolean remove(E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)) {
                int numMoved = size - i - 1;
                if (numMoved > 0) {
                    System.arraycopy(elements, i + 1, elements, i, numMoved);
                }
                elements[--size] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    private void ensureCapacity() {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
    }
}

