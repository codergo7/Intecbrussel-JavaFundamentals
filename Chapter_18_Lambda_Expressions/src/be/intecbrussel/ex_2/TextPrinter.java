package be.intecbrussel.ex_2;

import be.intecbrussel.ex_1.WordFilter;

public class TextPrinter {

    private String sentence;

    public TextPrinter(String sentence) {
        this.sentence = sentence;
    }

    public void printProcessedWords(TextProcessor processor) {
        for (String str : sentence.split(" ")) {
            System.out.println(processor.process(str));
        }
    }
}
