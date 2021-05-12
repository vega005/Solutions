package pl.daniel.pascal;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println(getPascalTriangle(5));
        //getPascalTriangle(5);
    }

    public static List<String> getPascalTriangle(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Number cannot be lower or equal to zero");
        }
        List<String> result = new ArrayList<>();
        StringBuilder element = new StringBuilder();
        int nodeValue;
        for (int i = 0; i < number; i++) {
            for (int k = 0; k <= i; k++) {
                nodeValue = factorial(i) / (factorial(k) * factorial(i - k));
                element.append(String.format("%d  ", nodeValue));
            }
            result.add(element.toString().trim());
            element.delete(0, element.length());
        }
        return result;
    }

    private static int factorial(int number) {
        int result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
