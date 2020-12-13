package be.intecbrussel.ex_3;

import be.intecbrussel.ex_1.Person;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamArray {

    public static void main(String[] args) {

        Person[] persons = Stream.of(new Person(),new Person(),new Person(),new Person(),new Person())
                           .toArray(Person[]::new);

        Person[] persons2 = Stream.of(new Person(),new Person(),new Person(),new Person(),new Person())
                            .toArray(size -> new Person[size]);


    }


}
