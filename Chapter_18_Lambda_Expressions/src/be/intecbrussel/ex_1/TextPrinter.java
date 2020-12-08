package be.intecbrussel.ex_1;

public class TextPrinter {

    private String sentence;

    public TextPrinter(String sentence) {
        this.sentence = sentence;
    }
    public void printFilteredWords(WordFilter filter){
        for(String str : sentence.split(" ")){
            if(filter.isValid(str)){
                System.out.println(str);
            }
        }
    }
}
