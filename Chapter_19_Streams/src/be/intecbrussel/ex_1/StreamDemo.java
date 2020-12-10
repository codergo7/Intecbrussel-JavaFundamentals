package be.intecbrussel.ex_1;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {
        String[] strings = {"Hello", "class","of", "Java","EE", "2020"};

        // print string array
        //Arrays.stream(strings).forEach(str-> System.out.printf("%s ", str));
        //Stream.of(strings).forEach(System.out::println);
        Stream.of(strings).forEach(s -> System.out.printf("%s ",s));
        System.out.println();

        // print 0-99
        IntStream.rangeClosed(1,100).forEach(i-> System.out.printf("%d ",i));




    }
}
