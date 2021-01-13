package be.intecbrussel.ex_7;

import be.intecbrussel.ex_2_Set.Person;

import java.util.*;

import static be.intecbrussel.ex_2_Set.Person.Gender.FEMALE;
import static be.intecbrussel.ex_2_Set.Person.Gender.MALE;

public class CompareApp {

    public static void main(String[] args) {

        //compareByName();

        //compareByAge();

        Comparator<Person> comparator = Comparator.comparing(Person::getFirstName)
                                                   .thenComparing(Person::getGender)
                                                    .thenComparing(Person::getHeight);
        compareByMultipleComparing(comparator);
    }

    private static void compareByMultipleComparing(Comparator<Person> comparator) {
        SortedSet<Person> people = getPersonSetList(comparator);
        people.forEach(System.out::println);
    }

    private static void compareByAge() {
        Comparator<Person> comparator = Comparator.comparing(Person::getAge);
        SortedSet<Person> people = getPersonSetList(comparator);
        people.forEach(System.out::println);
    }

    private static void compareByName() {
        Comparator<Person> comparator = Comparator.comparing(Person::getFirstName);
        SortedSet<Person> people = getPersonSetList(comparator);
        people.forEach(System.out::println);
    }

    private static SortedSet<Person> getPersonSetList(Comparator<Person> comparator) {
        SortedSet<Person> people = new TreeSet<>(comparator);
        char name = 'A';
        people.add(new Person(String.valueOf("Z"), String.valueOf(name++), MALE, 20, 60, 160));
        people.add(new Person(String.valueOf(name++), String.valueOf(name++), MALE, 20, 60, 160));
        people.add(new Person("V", String.valueOf(name++), FEMALE, 40, 70, 180));
        people.add(new Person(String.valueOf(name++), String.valueOf(name++), MALE, 50, 90, 176));
        people.add(new Person(String.valueOf(name++), String.valueOf(name++), FEMALE, 70, 75, 182));
        people.add(new Person(String.valueOf(name++), String.valueOf(name++), FEMALE, 30, 85, 165));
        people.add(new Person("B", String.valueOf(name++), FEMALE, 30, 85, 165));

        return people;
    }
}
