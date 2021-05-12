package pl.daniel.sort;

public class MergeSort implements SortingMethod {
    @Override
    public int[] sort(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        if (array.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        int[] tempArray = array.clone();
        mergeSort(tempArray, tempArray.length);
        return tempArray;
    }

    public static void mergeSort(int[] array, int arrayLength) {
        if (arrayLength < 2) {
            return;
        }
        int middleOfArray = arrayLength / 2;
        int[] leftArray = new int[middleOfArray];
        int[] rightArray = new int[arrayLength - middleOfArray];

        for (int i = 0; i < middleOfArray; i++) {
            leftArray[i] = array[i];
        }
        for (int i = middleOfArray; i < arrayLength; i++) {
            rightArray[i - middleOfArray] = array[i];
        }
        mergeSort(leftArray, middleOfArray);
        mergeSort(rightArray, arrayLength - middleOfArray);

        merge(array, leftArray, rightArray, middleOfArray, arrayLength - middleOfArray);
    }

    public static void merge(
            int[] array, int[] leftArray, int[] rightArray, int leftElementIndex, int rightElementIndex) {

        int i = 0, j = 0, k = 0;
        while (i < leftElementIndex && j < rightElementIndex) {
            if (leftArray[i] < rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }
        while (i < leftElementIndex) {
            array[k++] = leftArray[i++];
        }
        while (j < rightElementIndex) {
            array[k++] = rightArray[j++];
        }
    }
}
