package be.intecbrussel.ex_2;

import be.intecbrussel.ex_1.WordFilter;

import java.math.BigDecimal;
import java.util.function.Predicate;

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

    public void printSum(NumberParser parser) {
        BigDecimal sum= new BigDecimal(0);
        for (String str : sentence.split(" ")) {
             sum = sum.add(parser.parse(str));
        }
        System.out.println(sum);
    }

    public void numberParser(NumberParser parser) {
        for (String str : sentence.split(" ")) {
            System.out.println(parser.parse(str));
        }
    }

    public String getSentence() {
        return sentence;
    }
}
