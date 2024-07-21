package org.futurecollars.lesson9task2fifoQueue;

public interface OwnQueue {

    boolean add(Integer e);

    Integer remove();

    Integer element();

    boolean isEmpty();
}
