package pl.daniel.sort;

public class QuickSort implements SortingMethod {
    @Override
    public int[] sort(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        if (array.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        int[] tempArray = array.clone();
        quickSort(tempArray, 0, tempArray.length - 1);
        return tempArray;
    }

    private static void quickSort(int[] array, int minimumElementIndex, int maximumElementIndex) {
        if (minimumElementIndex < maximumElementIndex) {
            int pivot = partition(array, minimumElementIndex, maximumElementIndex);
            quickSort(array, minimumElementIndex, pivot);
            quickSort(array, pivot + 1, maximumElementIndex);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivotValue = array[low];
        int leftCursor = low - 1;
        int rightCursor = high + 1;

        while (true) {

            do {
                leftCursor++;
            }
            while (array[leftCursor] < pivotValue);

            do {
                rightCursor--;
            }
            while (array[rightCursor] > pivotValue);

            if (leftCursor < rightCursor) {
                swapElementsArray(array, leftCursor, rightCursor);
            } else {
                return rightCursor;
            }
        }
    }

    private static void swapElementsArray(int[] array, int indexOfFirstElement, int indexOfSecondElement) {
        int temp = array[indexOfFirstElement];
        array[indexOfFirstElement] = array[indexOfSecondElement];
        array[indexOfSecondElement] = temp;
    }
}
