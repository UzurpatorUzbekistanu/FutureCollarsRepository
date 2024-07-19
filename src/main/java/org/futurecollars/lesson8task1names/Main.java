package org.futurecollars.lesson8task1names;

public class Main {

    public static void main(String[] args) {
        NamesListCreator names = new NamesListCreator();
        names.addToList(
                "Anna",
                "Katarzyna",
                "Tymon",
                "Tadeusz",
                "Anna",
                "Karolina",
                "Dorota",
                "Piotr"
        );

        NamesListManager.printNamesListWithoutDuplicates(names.getNames());
        NamesListManager.printNamesListWithReverseOrder(names.getNames());
        NamesListManager.changeNameInNamesList("Anna", "Joanna", names.getNames());
        System.out.println(names);
    }
}
