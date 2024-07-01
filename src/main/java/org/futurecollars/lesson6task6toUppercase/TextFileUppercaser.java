package org.futurecollars.lesson6task6toUppercase;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextFileUppercaser {

    private static String readFile(){

        String textFromFile = "";

        try{

            textFromFile = Files.readString(Path.of("src/main/java/org/futurecollars/lesson6task6toUppercase/Input/data.txt"));

        } catch (IOException exception){

            exception.printStackTrace();
        }

        return textFromFile;
    }

    private static String convertToUppercase(){

        String textFromFile = readFile();

        return textFromFile.toUpperCase();
    }

    static void writeUppercasedTextToFile(){
        String uppercasedTextFromFile = convertToUppercase();
        try{
            Files.writeString(Path.of("src/main/java/org/futurecollars/lesson6task6toUppercase/Output/output.txt"), uppercasedTextFromFile);
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
