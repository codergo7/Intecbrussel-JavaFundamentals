package be.intecbrussel.ex_6;

import be.intecbrussel.ex_2_Set.Person;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

import static be.intecbrussel.ex_2_Set.Person.Gender.FEMALE;
import static be.intecbrussel.ex_2_Set.Person.Gender.MALE;

public class DequeApp {

    public static void main(String[] args) {

        Deque<Person> people = new ArrayDeque<>();
        char name = 'A';
        people.offerFirst(new Person(String.valueOf(name++),String.valueOf(name++), MALE, 20,60,160));
        people.offerLast(new Person(String.valueOf(name++),String.valueOf(name++),MALE, 20,60,160));
        people.offerLast(new Person(String.valueOf(name++),String.valueOf(name++),FEMALE, 40,70,180));
        people.offerFirst(new Person(String.valueOf(name++),String.valueOf(name++),MALE, 50,90,176));
        people.offerLast(new Person(String.valueOf(name++),String.valueOf(name++),FEMALE, 70,75,182));
        people.offerLast(new Person(String.valueOf(name++),String.valueOf(name++),FEMALE, 30,85,165));
        people.offerLast(new Person(String.valueOf(name++),String.valueOf(name++),FEMALE, 30,85,165));

        while (!people.isEmpty()){
            System.out.println(people.pollFirst() + " ---- " + people.pollLast() );
        }
    }
}
