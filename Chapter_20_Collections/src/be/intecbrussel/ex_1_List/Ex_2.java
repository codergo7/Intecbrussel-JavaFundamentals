package be.intecbrussel.ex_1_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Ex_2 {

    public static void main(String[] args) {
        List<String> listStr = new ArrayList<>();
        nextWithScanner(listStr);

        printListInReverseOrder(listStr);

        listToArray(listStr);
    }

    private static void listToArray(List<String> listStr) {
        String[] strArr = listStr.toArray(String[]::new);
        System.out.println("\n\n*** toArray ***");
        Stream.of(strArr)
                .forEach(s -> System.out.print(s + " "));
    }

    private static void printListInReverseOrder(List<String> listStr) {
        IntStream.rangeClosed(1, listStr.size())
                .mapToObj(index -> listStr.get(listStr.size() - index))
                .forEach(s -> System.out.print(s + " "));

        // Alternative, but this modifies the original list although stream doesn't do this
        //Collections.reverse(listStr);
        //listStr.forEach(s-> System.out.print(s+ " "));

    }

    private static void nextWithScanner(List<String> list) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a word: ");
            String str = scanner.next();
            list.add(str);
            if (str.endsWith(".")) {
                break;
            }
        }
    }
}
