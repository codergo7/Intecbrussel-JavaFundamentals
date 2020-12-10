package be.intecbrussel.ex_1;

import java.util.Random;
import java.util.stream.Stream;

public class PersonApp {

    public static void main(String[] args) {

        Stream.of(randomPersonGenerator()).forEach(System.out::println);
    }

    public static Person[] randomPersonGenerator() {
        Person[] people = new Person[10];
        Random random = new Random();
        String[] genders = {"female", "male"};

        for (int i = 0; i < people.length; i++) {
            people[i] = new Person("Name"+random.nextInt(1000),"Surname"+random.nextInt(1000),
                    genders[random.nextInt(2)], random.nextInt(91),10 +random.nextInt(120),
                    50 + random.nextInt(170));
        }
        return people;
    }
}
