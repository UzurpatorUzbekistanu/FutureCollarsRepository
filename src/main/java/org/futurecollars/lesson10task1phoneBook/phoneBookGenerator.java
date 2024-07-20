package org.futurecollars.lesson10task1phoneBook;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class phoneBookGenerator {

    public static void createPhoneBook() {
        String filePath = "src/main/java/org/futurecollars/lesson10task1phoneBook/phoneBook.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] nextLine = line.split(";");

                if (nextLine.length == 3) {
                    PhoneBook.phoneBook.add(new PhoneBook(nextLine[0], nextLine[1], nextLine[2]));
                } else {
                    PhoneBook.phoneBook.add(new PhoneBook(nextLine[0], nextLine[1]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
