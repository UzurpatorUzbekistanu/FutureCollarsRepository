package org.futurecollars.lesson6task0dataTxt;

public class Main {
    public static void main(String[] args) {
        TextFileCreator lineWriter = new TextFileCreator();

        String path = "C:\\Users\\XYZ\\FutureCollarsRepository\\src\\main\\java\\org\\futurecollars\\lesson6task0dataTxt\\Output\\data.txt";
        String[] wordsToWrite = {"Kurs", "Java", "Lekcja 6", "Pliki", "Wyjątki", "Pliki", "Koniec pliku"};

        for(int i = 0; i < wordsToWrite.length; i ++){
            lineWriter.writeToFile(path, wordsToWrite[i]);
        }
    }

}
