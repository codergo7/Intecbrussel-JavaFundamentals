package be.intecbrussel.aggregation;

/*
“a student has a name” is a composition relationship between the
Student class and the Name class, whereas “a student has an address”
is an aggregation relationship between the Student class and the Address
class, since an address can be shared by several students.
 */

public class Student {

    private Name name;

    private Address address;

    public void setAddress(Address address){
        this.address =address;
    }
}
