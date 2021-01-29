package be.intecbrussel.association;


import java.util.ArrayList;

// each student may take any number of courses
public class Student {

    private ArrayList<Course> courses;

    public void addCourse(Course course){
        courses.add(course);
    }
}
