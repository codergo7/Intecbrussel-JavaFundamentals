package be.intecbrussel.ex_8;

import be.intecbrussel.ex_2_Set.Person;

import java.util.*;

import static be.intecbrussel.ex_2_Set.Person.Gender.FEMALE;
import static be.intecbrussel.ex_2_Set.Person.Gender.MALE;

public class CollectionSortApp {

    public static void main(String[] args) {
        compareByName();
        compareByWeight();
    }

    private static void compareByName() {
        List<Person> personList = getPersonSetList();
        personList.sort(Comparator.comparing(Person::getFirstName));
        personList.forEach(System.out::println);
    }

    private static void compareByWeight() {
        List<Person> personList = getPersonSetList();
        personList.sort(Comparator.comparing(Person::getWeight));
        personList.forEach(System.out::println);
    }

    private static List<Person> getPersonSetList() {
        List<Person> people = new ArrayList<>();
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
