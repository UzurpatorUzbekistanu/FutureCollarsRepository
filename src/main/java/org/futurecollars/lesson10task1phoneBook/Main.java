package org.futurecollars.lesson10task1phoneBook;

public class Main {
    public static void main(String[] args) {

        phoneBookGenerator.createPhoneBook();
        System.out.println(PhoneBook.findRecordByFullName("Ewa Szewczyk"));
    }
}
