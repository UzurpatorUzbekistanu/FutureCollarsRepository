package org.futurecollars.lesson6task0dataTxt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collections;

public class TextFileCreator {
    public void writeToFile(String path, String lineOfText){
        try{
            Files.write(Paths.get(path), Collections.singletonList(lineOfText), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
