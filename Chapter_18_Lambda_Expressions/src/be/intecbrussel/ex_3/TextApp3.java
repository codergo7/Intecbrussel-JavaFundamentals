package be.intecbrussel.ex_3;

import be.intecbrussel.ex_2.TextUtil;

import java.math.BigDecimal;
import java.util.function.Function;

public class TextApp3 {

    public static void main(String[] args) {
        TextPrinter tp = new TextPrinter("Hello this is an example of a sentence containing words");

        //tp.printFilteredWords(word -> word.contains("a")&&word.contains("e"));

        Function<String, String> f1 = String::toUpperCase;
        Function<String, String> f2 = TextUtil::reverse;
        //tp.printProcessedWords(f1.andThen(f2));

        //tp.printSum(BigDecimal::new);

        tp.printNumberValues(BigDecimal::new);

    }
}
