package pl.daniel.multiplication;

import java.util.Arrays;

public class MultiplicationTable {

    public static void main(String[] args) {
        int[][] multiplicationTable = getMultiplicationTable(6);
        System.out.println(Arrays.deepToString(multiplicationTable));
    }

    public static int[][] getMultiplicationTable(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Size cannot be equal to or lower than zero");
        }
        int[][] array = new int[size][size];
        for (int column = 0; column < size; column++) {
            for (int row = 0; row < size; row++) {
                int result = (column + 1) * (row + 1);
                array[column][row] = result;
            }
        }
        return array;
    }
}

