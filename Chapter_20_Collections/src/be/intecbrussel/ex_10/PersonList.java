package be.intecbrussel.ex_10;

import be.intecbrussel.ex_2_Set.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static be.intecbrussel.ex_2_Set.Person.Gender.FEMALE;
import static be.intecbrussel.ex_2_Set.Person.Gender.MALE;

public class PersonList {

    public static void main(String[] args) {
        List<Person> people = getPersonSetList();

        List<Person> people2 = people.stream().filter(s->s.getGender().equals(FEMALE))
                        .filter(s->s.getAge()>20)
                        .sorted(Comparator.comparingInt(Person::getAge))
                        .collect(Collectors.toList());

        people2.forEach(System.out::println);
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
