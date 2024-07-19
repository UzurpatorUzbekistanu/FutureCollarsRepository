package org.futurecollars.lesson8task1names;

import java.util.ArrayList;
import java.util.List;

public class NamesListCreator {
    private List<String> names;

    NamesListCreator(){
        this.names = new ArrayList<>();
    }

    void addToList (String... names){
        for(String name: names){
            this.names.add(name);
        }
    }
    @Override
    public String toString() {
        return "NamesListManager{" +
                "names=" + names +
                '}';
    }

    public List<String> getNames() {
        return names;
    }
}
