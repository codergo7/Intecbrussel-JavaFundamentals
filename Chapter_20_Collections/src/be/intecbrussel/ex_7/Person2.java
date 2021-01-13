package be.intecbrussel.ex_7;

import java.util.Comparator;
import java.util.Objects;

public class Person2 implements Comparable<Person2>{

    private String firstName;
    private String lastName;
    private Gender gender;
    private int age;
    private int weight;
    private int height;

    public Person2() {
        this(null,null,null,1,3,30);
    }

    public Person2(String firstName, String lastName, Gender gender, int age, int weight, int height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person2)) return false;
        Person2 person = (Person2) o;
        return age == person.age && weight == person.weight && height == person.height && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(gender, person.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, gender, age, weight, height);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person: " +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender.name() + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height;
    }

    @Override
    public int compareTo(Person2 o) {
       // Comparator<String> comparator = String::compareTo;

        return 0 ;
    }

    public enum Gender{

       MALE("male"), FEMALE("female");

       private String name;

       Gender(String name) {
           this.name = name;
       }

      }
}
