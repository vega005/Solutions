package pl.daniel.io;

import java.util.Scanner;

public class NumbersProcessor {
    public String processLine(String line) {
        if (line == null) {
            throw new IllegalArgumentException("Line cannot be null");
        }
        if (!isLineValid(line)) {
            return "";
        }
        int sum = 0;
        Scanner scanner = new Scanner(line);
        StringBuilder numbers = new StringBuilder();
        while (scanner.hasNextInt()) {
            int value = scanner.nextInt();
            sum += value;
            numbers.append(value);
            if (scanner.hasNextInt()) {
                numbers.append("+");
            } else {
                numbers.append("=");
            }
        }
        return numbers.toString() + sum;
    }

    private boolean isLineValid(String line) {
        if (line == null || line.trim().isEmpty()) {
            return false;
        }
        return line.matches("^[\\d\\s]+");
    }
}
