package org.futurecollars.lesson6task3numberOfCharacters;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CharacterCounterOfDataFile {

    static void countCharacter(){
        try {
            String text = Files.readString(Path.of("src\\main\\java\\org\\futurecollars\\lesson6task3numberOfCharacters\\input\\data.txt"));
            System.out.println(text.length());
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
}
