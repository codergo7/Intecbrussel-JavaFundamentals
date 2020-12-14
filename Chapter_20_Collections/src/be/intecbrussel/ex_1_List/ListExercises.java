package be.intecbrussel.ex_1_List;

import java.util.*;

public class ListExercises {

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        fillTheListWithScanner(list);
        list.forEach(s-> System.out.print(s + " "));
        sum(list);
        average(list);

        List<String> listStr = new ArrayList<>();
        nextWithScanner(listStr);

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

    private static void fillTheListWithScanner(List<Integer> list) {
        //Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
            //System.out.println("Add a number please");
          // list.add(scanner.nextInt());
        }

    }

    private static void sum(List<Integer> list) {
        int result = list.stream()
                    .mapToInt(Integer::intValue)
                    .sum();

        System.out.println("\n\nSum: " + result);
    }

    private static void average(List<Integer> list) {
        OptionalDouble result = list.stream().
                                mapToInt(n->n)
                                .average();

        if(result.isPresent()){
            System.out.println("Average: " + result.getAsDouble());
        }
    }
}
