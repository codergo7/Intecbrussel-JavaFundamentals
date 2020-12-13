package be.intecbrussel.ex_4;

import be.intecbrussel.ex_1.Person;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex_4 {

    public static void main(String[] args) {
        Person[] persons= {new Person("Joe","Anybody","male",27,90,180),
                           new Person("Angelina","Anybody","female",40,58,172),
                           new Person("Maria","Anybody","female",37,60,168),
                           new Person("Ali","Anybody","male",45,85,178),
                           new Person("Ayse","Anybody","female",20,59,169)};

        System.out.println("**** Females ****");
        // prints only female persons
        Stream.of(persons)
                .filter(person -> person.getGender().equals("female"))
                .forEach(System.out::println);

        System.out.println("\n**** Persons over 30 years old ****");
        // prints only the persons over 30 years old
        Stream.of(persons)
                .filter(person -> person.getAge()>30)
                .forEach(System.out::println);

        System.out.println("\n**** Between 60-90 kg ****");
        // prints only the persons between 60-90 kg
        Stream.of(persons)
                .filter(person -> person.getWeight()>60)
                .filter(person -> person.getWeight()<90)
                .forEach(System.out::println);

        System.out.println("\n**** Persons over 30 years old and 60 kg ****");
        // prints only the persons over 30 years old and 60 kg
        Stream.of(persons)
                .filter(person -> person.getAge()>30)
                .filter(person -> person.getWeight()>60)
                .forEach(System.out::println);

        System.out.println("\n**** Ages of the persons ****");
        // prints ages of the persons
        Stream.of(persons)
                .mapToInt(person->person.getAge())
                .forEach(s-> System.out.print(s + " "));

        System.out.println("\n\n**** Name and surname ****");
        Stream.of(persons)
                .map(person -> person.getName() + " " + person.getSurname())
                .forEach(System.out::println);

        System.out.println("\n\n**** Average age ****");
        OptionalDouble average = Stream.of(persons)
                .mapToInt(person-> person.getAge())
                .average();

        if(average.isPresent()) {
            System.out.println("Average of the ages: "+ average);
        }

        System.out.println("\n**** Max age ****");
        OptionalInt max = Stream.of(persons)
                .mapToInt(person-> person.getAge())
                .max();

        if(average.isPresent()) {
            System.out.println("Max age: "+ max.getAsInt());
        }

        System.out.println("\n**** Min age ****");
        OptionalInt min = Stream.of(persons)
                .mapToInt(person-> person.getAge())
                .min();

        if(average.isPresent()) {
            System.out.println("Min age: "+ min.getAsInt());
        }
    }
}
