package pl.daniel.sieve;

import java.util.Arrays;

public class SieveOfEratosthenes {
    private final static int MARKER = 0;

    public static void main(String[] args) {
        int[] result = sieve(20);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sieve(int maximumNumber) {
        int[] arrayOfAllNumbers = createInitialArray(maximumNumber);
        removeMultiplies(arrayOfAllNumbers);
        return extractPrimeNumbers(arrayOfAllNumbers);
    }

    private static int[] createInitialArray(int maximumNumber) {
        int[] array = new int[maximumNumber];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }

    private static void removeMultiplies(int[] arrayToClean) {
        for (int i = 2; i < arrayToClean.length; i++) {
            for (int j = i * i; j < arrayToClean.length; j += i) {
                arrayToClean[j] = MARKER;
            }
        }
    }

    private static int[] extractPrimeNumbers(int[] array) {
        int[] arrayOfPrimeNumbers = new int[getCountOfPrimeNumbers(array)];
        for (int i = 2, j = 0; i < array.length; i++) {
            if (array[i] != MARKER) {
                arrayOfPrimeNumbers[j] = array[i];
                j++;
            }
        }
        return arrayOfPrimeNumbers;
    }

    private static int getCountOfPrimeNumbers(int[] array) {
        int result = 0;
        for (int i = 2; i < array.length; i++) {
            if (array[i] != MARKER) {
                result++;
            }
        }
        return result;
    }
}
