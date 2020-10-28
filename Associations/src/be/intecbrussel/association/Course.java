package be.intecbrussel.association;


import java.util.ArrayList;

//Each course must have at least five and at most sixty students.
// Each course is taught by only one faculty member
public class Course {

    private ArrayList<Student> students;
    private Faculty faculty;

    {
        students = new ArrayList<>();
    }

    public Course(Faculty faculty) {
        this.faculty = faculty;
    }

    public void addStudent(Student student) {
        if (students.size() <= 60) {
            students.add(student);
        } else {
            System.out.println("The course can not have more than 60 students");
        }
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
}
