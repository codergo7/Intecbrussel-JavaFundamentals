package be.intecbrussel.ex_2_Set;

import java.util.Collection;
import java.util.HashSet;

import static be.intecbrussel.ex_2_Set.Person.Gender.*;

public class PersonApp {

    public static void main(String[] args) {
        Collection<Person> people = new HashSet<>();

        people.add(new Person("A","B", MALE, 20,60,160));
        people.add(new Person("A","B",MALE, 20,60,160));
        people.add(new Person("E","F",FEMALE, 40,70,180));
        people.add(new Person("G","H",MALE, 50,90,176));
        people.add(new Person("K","L",FEMALE, 70,75,182));
        people.add(new Person("D","C",FEMALE, 30,85,165));


        people.forEach(System.out::println);
    }
}
