package org.futurecollars.lesson6task2printEverySecondLine;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class EverySecondLinePrinter {

    static void printEverySecondLineDataFile(){
        String text = null;
        try {
            int rowNumber = 1;
            List<String> textLines = Files.readAllLines(Path.of("FutureCollarsRepository\\src\\main\\java\\org\\futurecollars\\lesson6task2printEverySecondLine\\input\\data.txt"));
            for(String line : textLines){
                if (rowNumber % 2 == 0){
                    System.out.println(line);
                }
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
