package pl.daniel.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileProcessor {
    public List<String> readLinesFromFile(String filePath) throws FileNotFoundException {
        if (filePath == null) {
            throw new IllegalArgumentException("File path cannot be null");
        }
        List<String> lines = new ArrayList<>();
        Scanner scanner = new Scanner(new File(filePath));
        while (scanner.hasNextLine()) {
            lines.add(scanner.nextLine());
        }
        scanner.close();
        return lines;
    }

    public void writeLinesToFile(String filePath, List<String> lines) throws FileNotFoundException {
        if (filePath == null || lines == null) {
            throw new IllegalArgumentException("File path and lines cannot be null");
        }
        PrintWriter printWriter = new PrintWriter(filePath);
        for (String line : lines) {
            printWriter.println(line);
        }
        printWriter.close();
    }
}
