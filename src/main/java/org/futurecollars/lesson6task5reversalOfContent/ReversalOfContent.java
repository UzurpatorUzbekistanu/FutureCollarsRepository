package org.futurecollars.lesson6task5reversalOfContent;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReversalOfContent {

    private static String[] getContentFromDataFile(){

        String textFromFile = null;

        try{
            textFromFile = Files.readString(Path.of("src/main/java/org/futurecollars/lesson6task5reversalOfContent/Input/data.txt"));
        } catch (IOException exception){
            exception.printStackTrace();
        }
        String[] linesFromFile = textFromFile.split("\n");
        return linesFromFile;
    }

    private static String reverseContentInDataFile(){

        String[] linesFromFile = getContentFromDataFile();
        String reversedText = "";

        int largestIndex = linesFromFile.length - 1;

        for(int i = 0; i < linesFromFile.length; i++ ){
            reversedText += linesFromFile[largestIndex - i];
            reversedText += "\n";
        }
        return reversedText;
    }
    static void printReversedContentFromDataFile(){

        String reversedText = reverseContentInDataFile();

        System.out.println("Odwrócony tekst z pliku data.txt");
        System.out.println();
        System.out.println(reversedText);
    }

}
