package be.intecbrussel.ex_1;

public class Person {

    private String name;
    private String surname;
    private String gender;
    private int age;
    private float weight;
    private float height;

    public Person() {
        this(null,null,null,1,3,30);
    }

    public Person(String name, String surname, String gender, int age, float weight, float height) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public float getWeight() {
        return weight;
    }

    public float getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Person: " +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height;
    }
}
