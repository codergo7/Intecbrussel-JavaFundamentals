package be.intecbrussel.ex_4;

import java.util.*;

public class TreeSetExercises {

    public static void main(String[] args) {

        //integerTreeSet();

        //stringTreeSet();

        stringTreeSetReversedOrder();
    }

    private static void stringTreeSetReversedOrder() {

        String[] strings = StringListArray.fillTheArray();
        SortedSet<String> integerNavigableSet = new TreeSet<>(Comparator.reverseOrder());
        Random random = new Random();

        for (int i = 0; i < 55; i++) {
            integerNavigableSet.add(strings[random.nextInt(strings.length)]);
        }
        integerNavigableSet.first();
        integerNavigableSet.forEach(s-> System.out.print(s + " "));
    }

    private static void stringTreeSet() {

        String[] strings = StringListArray.fillTheArray();
        NavigableSet<String> integerNavigableSet = new TreeSet<>();
        Random random = new Random();

        for (int i = 0; i < 55; i++) {
            integerNavigableSet.add(strings[random.nextInt(strings.length)]);
        }
        integerNavigableSet.first();
        integerNavigableSet.forEach(s-> System.out.print(s + " "));
    }

    private static void integerTreeSet() {
        NavigableSet<Integer> integerNavigableSet = new TreeSet<>();
        Random random = new Random();

        for (int i = 0; i < 55; i++) {
            integerNavigableSet.add(random.nextInt(100));
        }
        integerNavigableSet.forEach(s-> System.out.print(s + " "));
    }
}
