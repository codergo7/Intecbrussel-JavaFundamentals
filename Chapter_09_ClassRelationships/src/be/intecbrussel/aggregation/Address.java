package be.intecbrussel.aggregation;

import java.util.ArrayList;

public class Address {

    private ArrayList<Student> students;

    {
        students = new ArrayList<>();
    }

    public Address() {
    }

    public void addStudent(Student student){
        students.add(student);
    }
}
