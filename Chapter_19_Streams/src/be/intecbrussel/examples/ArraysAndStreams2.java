// Examples of book of Deitel
// Demonstrating lambdas and streams with an array of Strings.
package be.intecbrussel.examples;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArraysAndStreams2 {

    public static void main(String[] args) {

        String[] strings = {"Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet"};

        // display original strings
        System.out.printf("Original strings: %s%n", Arrays.asList(strings));

        // strings in uppercase
        System.out.printf("strings in uppercase: %s%n",
                Arrays.stream(strings).map(String::toUpperCase).collect(Collectors.toList()));

        // strings in uppercase
        // map method uses and implements apply method of Function functional interface
        System.out.printf("strings in uppercase: %s%n",
                Arrays.stream(strings).map(new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        return s.toUpperCase();
                    }
                }).collect(Collectors.toList()));


        // strings less than "n" (case insensitive) sorted ascending
        System.out.printf("strings greater than m sorted ascending: %s%n",
                Arrays.stream(strings)
                        .filter(s -> s.compareToIgnoreCase("n")<0)
                        .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                        .collect(Collectors.toList()));

        // strings less than "n" (case insensitive) sorted descending
        System.out.printf("strings greater than m sorted descending: %s%n",
                Arrays.stream(strings)
                        .filter(s -> s.compareToIgnoreCase("n")<0)
                        .sorted()
                        .collect(Collectors.toList()));

    }
}
