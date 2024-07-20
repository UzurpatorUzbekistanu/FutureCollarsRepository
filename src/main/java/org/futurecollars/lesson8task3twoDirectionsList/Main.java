package org.futurecollars.lesson8task3twoDirectionsList;

public class Main {
    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        list.add(1, 15);

        list.remove(2);

    }

}
