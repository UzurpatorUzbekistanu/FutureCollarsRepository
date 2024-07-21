package org.futurecollars.lesson9task2fifoQueue;

import java.util.NoSuchElementException;

public class SimpleQueue implements OwnQueue {
    private Node head;
    private Node tail;
    private int size;

    private static class Node {
        Integer data;
        Node next;

        Node(Integer data) {
            this.data = data;
        }
    }

    public SimpleQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public boolean add(Integer e) {
        Node newNode = new Node(e);
        if (tail == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
        return true;
    }

    @Override
    public Integer remove() {
        if (head == null) {
            throw new NoSuchElementException("Queue is empty");
        }
        Integer value = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return value;
    }

    @Override
    public Integer element() {
        if (head == null) {
            throw new NoSuchElementException("Queue is empty");
        }
        return head.data;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}


