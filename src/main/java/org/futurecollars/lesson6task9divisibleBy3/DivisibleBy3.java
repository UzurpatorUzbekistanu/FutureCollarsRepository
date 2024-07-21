package org.futurecollars.lesson6task9divisibleBy3;

public class DivisibleBy3 {
    public void validate(int[] values) throws IllegalArgumentException {


        for(int index = 0; index < values.length; index++) {
            try {
                if (values[index] % 3 != 0) {
                    throw new IllegalArgumentException("The number " + values[index] + " is not divisible by three");
                }
                System.out.println(values[index] + " is divisible by three");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
