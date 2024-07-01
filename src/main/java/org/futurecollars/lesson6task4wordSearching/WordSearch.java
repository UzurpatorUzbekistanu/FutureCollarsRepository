package org.futurecollars.lesson6task4wordSearching;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;

public class WordSearch {

    static void isWordInDataFile(String wordToSearch){
        String text = null;
        try{
            text = Files.readString(Path.of("src/main/java/org/futurecollars/lesson6task4wordSearching/Input/data.txt"));
        } catch (IOException exception){
            exception.printStackTrace();
        }
        wordToSearch = wordToSearch.toLowerCase();
        text = text.toLowerCase();
        if(text.contains(wordToSearch)){
            System.out.println("Słowo " + wordToSearch + " występuje w pliku Data.txt");
        } else {
            System.out.println("Słowo \"" + wordToSearch + "\" nie występuje w pliku Data.txt");
        }
    }
}
