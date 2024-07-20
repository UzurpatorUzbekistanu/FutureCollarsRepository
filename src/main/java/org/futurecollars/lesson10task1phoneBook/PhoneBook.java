package org.futurecollars.lesson10task1phoneBook;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PhoneBook {
    private String fullName;
    private String phoneNumber;
    private String address;
    public static List<PhoneBook> phoneBook = new ArrayList<>();

    public PhoneBook(String fullName, String address) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
    }

    public PhoneBook(String fullName, String address,String phoneNumber) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    static List<PhoneBook> findRecordByFullName(String fullName){
        List<PhoneBook> foundedRecords = phoneBook.stream()
                .filter(object -> object.fullName.equals(fullName))
                .collect(Collectors.toList());
        if(foundedRecords.isEmpty()){
            throw new RuntimeException("record not found");
        }
        return foundedRecords;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "fullName='" + fullName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
