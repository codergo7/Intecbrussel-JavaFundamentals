package be.intecbrussel.ex_2;

import java.math.BigDecimal;

public class TextApp2 {

    public static void main(String[] args) {
        TextPrinter tp = new TextPrinter("Hello this is an example of a sentence containing words");

        //Same
        //tp.printProcessedWords(s -> String.format("<<s>>",s));
        //tp.printProcessedWords(s -> TextUtil.quote(s));
        //tp.printProcessedWords(TextUtil::quote);

       // tp.printProcessedWords(TextUtil::reverse);

        TextScrambler ts = new TextScrambler();
        //Same
        //tp.printProcessedWords(s -> ts.scramble(s));
        //tp.printProcessedWords(ts::scramble);


        TextPrinter tp2 = new TextPrinter("555 345 567 5678");
        //tp2.numberParser(BigDecimal::new);
        tp2.printSum(BigDecimal::new);
    }
}
