package be.intecbrussel.ex_2_Set;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HashSetScanner {

    public static void main(String[] args) {
        Collection<String> setStr = new HashSet<>();
        nextWithScanner(setStr);

        listToArray(setStr);
    }

    private static void listToArray(Collection<String> setStr) {
        String[] strArr = setStr.toArray(String[]::new);
        System.out.println("\n\n*** toArray ***");
        Stream.of(strArr)
                .forEach(s -> System.out.print(s + " "));
    }



    private static void nextWithScanner(Collection<String> setStr) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String str = scanner.next();
            setStr.add(str);
            if (str.endsWith(".")) {
                break;
            }
        }
        setStr.forEach(s -> System.out.print(s + " "));
    }
}
