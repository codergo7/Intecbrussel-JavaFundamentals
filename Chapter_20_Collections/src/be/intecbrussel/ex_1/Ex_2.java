package be.intecbrussel.ex_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Ex_2 {

    public static void main(String[] args) {
        List<String> listStr = new ArrayList<>();
        nextWithScanner(listStr);

        printListInReverseOrder(listStr);
    }

    private static void printListInReverseOrder(List<String> listStr) {
        IntStream.rangeClosed(1,listStr.size())
                .mapToObj(index->listStr.get(listStr.size()-index))
                .forEach(s -> System.out.print(s + " "));

        // Alternative
        Collections.reverse(listStr);
        listStr.forEach(s-> System.out.print(s+ " "));

    }

    private static void nextWithScanner(List<String> list) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String str = scanner.next();
            list.add(str);
            if(str.endsWith(".")){
                break;
            }
        }
    }
}
