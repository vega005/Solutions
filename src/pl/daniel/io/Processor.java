package pl.daniel.io;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Processor {
    private NumbersProcessor numbersProcessor;
    private FileProcessor fileProcessor;

    public Processor(NumbersProcessor numbersProcessor, FileProcessor fileProcessor) {
        if (numbersProcessor == null || fileProcessor == null) {
            throw new IllegalArgumentException("Numbers and file processor cannot be null");
        }
        this.numbersProcessor = numbersProcessor;
        this.fileProcessor = fileProcessor;
    }

    public void process(String inputFilePath, String outputFilePath) throws FileNotFoundException {
        if (inputFilePath == null || outputFilePath == null) {
            throw new IllegalArgumentException("InputFilePath and OutputFilePath cannot be null");
        }
        List<String> linesFromFile = fileProcessor.readLinesFromFile(inputFilePath);
        List<String> resultLines = new ArrayList<>();
        for (String line : linesFromFile) {
            resultLines.add(numbersProcessor.processLine(line));
        }
        fileProcessor.writeLinesToFile(outputFilePath, resultLines);
    }
}
