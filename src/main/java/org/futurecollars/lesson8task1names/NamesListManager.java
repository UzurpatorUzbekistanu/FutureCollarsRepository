package org.futurecollars.lesson8task1names;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class NamesListManager {

    static void printNamesListWithoutDuplicates(List<String> names){
        System.out.println(names.stream().distinct().collect(Collectors.toList()));
    }
    static void printNamesListWithReverseOrder(List<String> names){
        Collections.reverse(names);
        System.out.println(names);
    }

    static void changeNameInNamesList(String nameToFind, String changedName, List<String> names){
        names.replaceAll(name -> name.equals(nameToFind) ? changedName : name);

        System.out.println(names);
    }
}
