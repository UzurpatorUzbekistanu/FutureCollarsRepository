package org.futurecollars.lesson8task2ownList;


public class Main {
    public static void main(String[] args) {
        CustomIntegerList list = new CustomIntegerList();
        System.out.println(list.isEmpty());
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(18);
        list.add(19);
        list.add(20);
        list.add(21);
        System.out.println(list);
        list.add(3, 55);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);

    }
}
