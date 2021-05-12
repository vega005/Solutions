package pl.daniel.sort;

public class SelectionSort implements SortingMethod {
    @Override
    public int[] sort(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        if (array.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        int[] result = array.clone();
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            int minimalElementPosition = i;
            for (int j = i + 1; j < length; j++) {
                if (result[j] < result[minimalElementPosition]) {
                    minimalElementPosition = j;
                }
            }
            swap(result, i, minimalElementPosition);
        }
        return result;
    }

    private void swap(int[] array, int firstElementPosition, int secundElementPosition) {
        int temp = array[firstElementPosition];
        array[firstElementPosition] = array[secundElementPosition];
        array[secundElementPosition] = temp;
    }
}
