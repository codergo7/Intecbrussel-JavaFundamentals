package be.intecbrussel.ex_1;

public class TextApp {

    public static void main(String[] args) {
        String text = "Hello this is an example of a sentence containing words";
        TextPrinter tp = new TextPrinter(text);

        System.out.println("*** Words containing e ***");
        // with anonymous nested class
        tp.printFilteredWords(new WordFilter() {
            @Override
            public boolean isValid(String s) {
                return s.contains("e");
            }
        });

        System.out.println("\n*** Words containing e ***");
        // with lambda expressions
        tp.printFilteredWords(s -> s.contains("e"));

        System.out.println("\n*** Words which are greater than 4 in length ***");
        tp.printFilteredWords(s->s.length()>4);

        System.out.println("\n*** Words starting with with 'a' ***");
        tp.printFilteredWords(s -> s.startsWith("a"));

    }
}
