package pl.daniel.fibonacci;

public class FibonacciRecursive {
    public static void main(String[] args) {
        System.out.println(fibonacci(6));
    }

    public static long fibonacci(int fibonacciNumberInOrder) {
        if (fibonacciNumberInOrder <= 0) {
            return -1;
        }
        if (fibonacciNumberInOrder <= 2) {
            return 1;
        }
        return fibonacci(fibonacciNumberInOrder - 1) + fibonacci(fibonacciNumberInOrder - 2);
    }
}
