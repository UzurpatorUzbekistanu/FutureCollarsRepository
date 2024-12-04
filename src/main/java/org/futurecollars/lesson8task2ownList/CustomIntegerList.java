package org.futurecollars.lesson8task2ownList;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomIntegerList implements OwnList{

    private Integer[] table;
    private int size;

    CustomIntegerList(){
        this.table = new Integer[10];
        this.size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(Integer element) {
        if (size < 10){
            table[size] = element;
            size++;
        } else {
            Integer[] resizedTable = new Integer[table.length + 1];
            for(int index = 0; index < table.length; index++){
                resizedTable[index] = table[index];
            }
            resizedTable[size] = element;
            table = resizedTable;
            size ++;
        }
    }

    @Override
    public Integer get(int i) {
        return table[i];
    }

    private void copyTable(Integer[] table, Integer[] resizedTable){
        for(int i = 0; i < table.length; i++){
            resizedTable[i] = table[i];
        }
    }

    @Override
    public void add(int index, Integer element) {

        if(index > table.length){
            Integer[] resizedTable = new Integer[index + 1];

            copyTable(table, resizedTable);

            for(int i = table.length -1; i < resizedTable.length; i++){
                resizedTable[i] = null;
            }
            resizedTable[index] = element;
            table = resizedTable;
            size = resizedTable.length;
            return;
        }
        if(index == table.length){
            Integer[] resizedTable = new Integer[table.length+1];

            copyTable(table, resizedTable);

            table = resizedTable;
            table[index] = element;
            size++;
            return;
        }
        if(index == table.length - 1){
            Integer[] resizedTable = new Integer[table.length+1];

            copyTable(table, resizedTable);

            table = resizedTable;
            table[index] = element;
            size++;
            return;
            }
        if(index < table.length - 1){
            Integer[] resizedTable = new Integer[table.length+1];

            copyTable(table, resizedTable);

            int shiftedValue = table[index];
            resizedTable[index] = element;
            for (int i = index + 1; i < resizedTable.length; i++){
                resizedTable[i] = shiftedValue;
                if(i < table.length){
                    shiftedValue = table[i];
                }
            }
            table = resizedTable;
            size++;
        }
        }


    @Override
    public void remove(int index) {
        try{
            Integer[] resizedTable = new Integer[table.length - 1];
            for(int i = 0; i < index; i++){
                resizedTable[i] = table[i];
            }
            for(int i = index; i < table.length - 1; i++){
                resizedTable[i] = table[i + 1];
            }
            table = resizedTable;
            size--;
        }catch (ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "CustomIntegerList{" +
                "table=" + Arrays.toString(table) +
                '}';
    }
}
