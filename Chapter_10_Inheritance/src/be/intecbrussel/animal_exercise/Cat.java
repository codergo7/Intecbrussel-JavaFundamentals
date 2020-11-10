package be.intecbrussel.animal_exercise;

public class Cat extends Animal {


    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("The cat is  running");
    }

    @Override
    public void makeNoise() {
        System.out.println("The cat is meowing");

    }
}
