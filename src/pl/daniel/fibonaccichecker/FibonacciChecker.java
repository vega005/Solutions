package pl.daniel.fibonaccichecker;

import java.util.HashMap;
import java.util.Map;

public class FibonacciChecker {
    private static Map<Long, Boolean> cache = new HashMap<>();

    public static void main(String[] args) {
        boolean isFibonacci = isFibonacciNumber(7);
        System.out.println(isFibonacci);
    }

    public static boolean isFibonacciNumber(long number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Number cannot be lower or equals zero ");
        }

        if (cache.containsKey(number)) {
            return cache.get(number);
        }

        long formula1 = 5 * (number * number) + 4;
        long formula2 = 5 * (number * number) - 4;
        boolean isFibonacci = isPerfectSquare(formula1) || isPerfectSquare(formula2);

        cache.put(number, isFibonacci);

        return isFibonacci;
    }

    private static boolean isPerfectSquare(long formula) {
        return (Math.sqrt(formula) % 1) == 0;
    }
}
