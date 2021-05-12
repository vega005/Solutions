package pl.daniel.fibonacci;

public class FibonacciIterative {
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }

    public static long fibonacci(int fibonacciNumberInOrder) {
        if (fibonacciNumberInOrder > 0) {
            int actualValue = 1;
            int previousValue = 1;

            for (int i = 2; i < fibonacciNumberInOrder; i++) {
                int temp = actualValue;
                actualValue += previousValue;
                previousValue = temp;
            }
            return actualValue;
        }
        return -1;
    }
}
