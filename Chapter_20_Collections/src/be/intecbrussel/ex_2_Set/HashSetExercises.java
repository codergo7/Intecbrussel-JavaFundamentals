package be.intecbrussel.ex_2_Set;

import java.util.*;

public class HashSetExercises {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        fillTheListWithScanner(set);
        set.forEach(s-> System.out.print(s + " "));
        sum(set);
        average(set);
    }

    private static void fillTheListWithScanner(Set<Integer> set) {
        //Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            set.add(random.nextInt(100));
            //System.out.println("Add a number please");
            // list.add(scanner.nextInt());
        }

        System.out.println("Size: " + set.size());
    }

    private static void sum(Set<Integer> set) {
        int result = set.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("\n\nSum: " + result);
    }

    private static void average(Set<Integer> set) {
        OptionalDouble result = set.stream().
                mapToInt(n->n)
                .average();

        if(result.isPresent()){
            System.out.println("Average: " + result.getAsDouble());
        }
    }
}
