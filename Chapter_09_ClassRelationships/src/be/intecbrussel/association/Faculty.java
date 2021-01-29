package be.intecbrussel.association;


import java.util.ArrayList;

//a faculty member may teach from zero to three courses per semester.
public class Faculty {

    private ArrayList<Course> courses;

    public void addCourse(Course course){
        if(courses.size()<=3){
            courses.add(course);
        }
        else {
            System.out.println("The faculty can not have more than 3 courses");
        }
    }
}
