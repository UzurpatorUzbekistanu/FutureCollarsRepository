package org.futurecollars.lesson6task4wordSearching;

import java.util.Scanner;

public class WordCollect {

    static String takeWord(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj słowo do wyszukania w pliku data.txt");
        String word = scanner.nextLine();
        scanner.close();
        return word;
    }
}
