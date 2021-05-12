package pl.daniel.sort;

public class BubbleSort implements SortingMethod {
    @Override
    public int[] sort(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        if (array.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        int[] resultArray = array.clone();
        int length = array.length;
        for (int i = 0; i < length; i++) {
            for (int j = 1; j < length - i; j++) {
                if (resultArray[j - 1] > resultArray[j]) {
                    swap(resultArray, j);
                }
            }
        }
        return resultArray;
    }

    private void swap(int[] array, int position) {
        int temp = array[position - 1];
        array[position - 1] = array[position];
        array[position] = temp;
    }
}
