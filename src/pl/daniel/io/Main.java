package pl.daniel.io;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Processor processor = new Processor(new NumbersProcessor(), new FileProcessor());
        processor.process("resources/numbersFromFile", "resources/numbersFromFile");
        System.out.println(processor);
    }
}

