package org.futurecollars.lesson11task4doctors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Doctors {
    public static void main(String[] args) {
        List<String> inPutdoctors = List.of(
                "Szpital:Chirurg:Radiolog:Chirurg Szczękowy:Pediatra",
                "Przychodnia:Pediatra",
                "Przychodnia:Internista:Laryngolog:Pediatra"
        );

        List<String> doctors = inPutdoctors.
                stream()
                .map(spec -> spec.split(":"))
                .flatMap(array -> Arrays.stream(array))
                .filter(splitedString -> !splitedString.equals("Szpital") &&
                        !splitedString.equals("Przychodnia"))
                .distinct()
                .collect(Collectors.toList());

        for(String doctor : doctors){
            System.out.print(doctor + ", ");
        }

        }
    }


