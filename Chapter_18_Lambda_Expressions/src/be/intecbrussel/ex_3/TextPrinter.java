package be.intecbrussel.ex_3;

import be.intecbrussel.ex_1.WordFilter;
import be.intecbrussel.ex_2.NumberParser;
import be.intecbrussel.ex_2.TextProcessor;

import java.math.BigDecimal;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class TextPrinter {

    private String sentence;
    private Consumer<String> consumer;
    private String sentenceNumber="123 456 789";

    public TextPrinter(String sentence) {
        this.sentence = sentence;
    }

    public TextPrinter(String sentence, Consumer<String> consumer) {
        this.sentence = sentence;
        this.consumer = consumer;
    }

    public void printFilteredWords(Predicate<String> predicate){
        for(String str : sentence.split(" ")){
            if(predicate.test(str)){
                System.out.println(str);
            }
        }
    }

    public void printProcessedWords(Function<String,String> function) {
        for (String str : sentence.split(" ")) {
            System.out.println(function.apply(str));
        }
    }

    public void printNumberValues(Function<String, BigDecimal> function) {
        for (String word : sentenceNumber.split(" ")) {
            System.out.println(function.apply(word));
        }
    }

    public void printSum(Function<String,BigDecimal> function) {
        BigDecimal sum= new BigDecimal(0);
        for (String str : sentenceNumber.split(" ")) {
            sum = sum.add(function.apply(str));
        }
        System.out.println(sum);
    }

}
