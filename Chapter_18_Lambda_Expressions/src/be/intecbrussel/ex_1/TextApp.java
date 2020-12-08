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

        System.out.println("\n*** Long words ***");
        tp.printFilteredWords(s->s.length()>4);

        System.out.println("\n*** Words starting with with 'a' ***");
        tp.printFilteredWords(s -> s.startsWith("a"));

        System.out.println("\n*** Words which second letter is 'e' ***");
        tp.printFilteredWords(word -> word.length()>1 && word.substring(1,2).equals("e"));

        System.out.println("\n*** Words containing more than one 'e' ***");
        tp.printFilteredWords(word -> word.indexOf('e')!=word.lastIndexOf('e'));

        System.out.println("\n*** Words containing two 'e' with anonymous nested class ***");
        tp.printFilteredWords(new WordFilter() {
            @Override
            public boolean isValid(String s) {
                int amountOfE= 0;
                for(String s1 :s.split("")){
                    if(s1.equals("e")){
                        amountOfE++;
                    }
                }
                return amountOfE==2;
            }
        });

        System.out.println("\n*** Words containing two 'e' with lambda ***");
        tp.printFilteredWords(word ->{
            int amountOfE= 0;
            for(char c :word.toCharArray()){
                if(c=='e'){
                    amountOfE++;
                }
            }
            return amountOfE==2;
        });
    }
}
