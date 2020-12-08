package be.intecbrussel.ex_2;

public class TextScrambler {

    public String scramble(String str) {

        return str.replaceAll("a", "@")
                .replaceAll("e", "€")
                .replaceAll("l", "1")
                .replaceAll("o", "0");
    }
}