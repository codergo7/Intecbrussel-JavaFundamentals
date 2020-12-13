package be.intecbrussel.ex_2;

import java.util.stream.Stream;

public class StreamOperations {

    public static void main(String[] args) {

        String[] strings = {"Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet"};

        String result = Stream.of(strings).reduce("", (acc, el) -> acc + el + ";");
        System.out.println(result);

    }
}
