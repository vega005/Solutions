package pl.daniel.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSort implements SortingMethod {

    @Override
    public int[] sort(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        if (array.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        int[] tempArray = array.clone();
        List<Integer> listOfIntegers = convertArrayToList(tempArray);
        Collections.sort(listOfIntegers);
        return convertListToArray(listOfIntegers);
    }

    private List<Integer> convertArrayToList(int[] array) {
        List<Integer> listOfIntegers = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            listOfIntegers.add(array[i]);
        }
        return listOfIntegers;
    }

    private int[] convertListToArray(List<Integer> list) {
        int[] arraysOfIntegers = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arraysOfIntegers[i] = list.get(i);
        }
        return arraysOfIntegers;
    }
}
