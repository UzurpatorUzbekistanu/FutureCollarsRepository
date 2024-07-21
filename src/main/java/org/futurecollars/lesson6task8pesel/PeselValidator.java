package org.futurecollars.lesson6task8pesel;

public class PeselValidator {

    private static final int PESEL_LENGTH = 11;

    boolean validatePesel (String pesel){
        if (pesel == null) {
            throw new WrongTypeOfDataException("PESEL cannot be null");
        }

        if (pesel.length() != PESEL_LENGTH) {
            throw new IllegalLengthException("PESEL must be 11 digits long");
        }
        return true;
    }

}
