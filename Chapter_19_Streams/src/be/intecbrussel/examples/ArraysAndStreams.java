// Examples of book of Deitel
package be.intecbrussel.examples;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArraysAndStreams {

    public static void main(String[] args) {

        Integer[] values = {2, 9, 5, 0, 3, 7, 1, 4, 8, 6};

        // display original values
        System.out.printf("Original values: %s%n", Arrays.asList(values));

        // sort values in ascending order
        //Stream.of(values).sorted().forEach(i -> System.out.printf("%d ",i));
        Stream.of(values).sorted().collect(Collectors.toCollection(ArrayList::new));

        // values greater than 4
        List<Integer> greaterThan4 = Stream.of(values).filter(i->i>4).collect(Collectors.toList());
        System.out.printf("Values greater than 4: %s%n", greaterThan4);

        // filter values greater than 4 then sort the results
        System.out.printf("Sorted values greater than 4: %s%n",
                Arrays.stream(values).filter(i-> i>4).sorted().collect(Collectors.toList()));

        // filter values greater than 4 then sort the results
        System.out.printf("Sorted values greater than 4: %s%n",
                Arrays.stream(values).filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer integer) {
                        return integer>4;
                    }
                }).sorted().collect(Collectors.toList()));

        // greaterThan4 List sorted with streams
        System.out.printf("Values greater than 4 (ascending with streams): %s%n",
                greaterThan4.stream().sorted().collect(Collectors.toList()));


    }
}
