package org.futurecollars.lesson9task3genericList;

public interface OwnList<E> {

    static final int DEFAULT_CAPACITY = 10;

    boolean add(E e);

    E get(int index);

    boolean remove(E o);

    int size();
}
