package org.futurecollars.lesson11task6lettersInWords;


import java.util.List;
import java.util.stream.Collectors;

public class LettersInWords {

    public static void main(String[] args) {
        List<String> wordsList = List.of(
                "baran",
                "kabanos",
                "Turkusowy",
                "Organoleptyczny"
        );

        wordsList.stream()
                .map(word -> {
                    return word.chars()
                            .mapToObj(c -> (char) c)
                            .distinct()
                            .map(String::valueOf)
                            .collect(Collectors.joining());
                })
                .forEach(result -> {
                    System.out.println(result);
                });

    }
}
