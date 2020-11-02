package be.intecbrussel.ex_car;

import java.util.Comparator;

public class ComparatorByAge implements Comparator<Person> {

    // sorts Persons in descending order by age
    @Override
    public int compare(Person person1, Person person2) {
        return person2.getAge()- person1.getAge();
    }
}
