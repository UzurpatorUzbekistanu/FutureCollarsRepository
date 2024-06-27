package org.futurecollars.lesson6task1fileReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class dataFileReader {

    static void printDataFile () {
        String text = null;
        try {
            text = Files.readString(Path.of("C:\\Users\\XYZ\\FutureCollarsRepository\\src\\main\\java\\org\\futurecollars\\lesson6task1fileReader\\input\\data.txt"));
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        System.out.println(text);
    }
}
