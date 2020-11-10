package be.intecbrussel.animal_exercise;

public class Fish extends Animal{
    public Fish() {
    }

    public Fish(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("The fish is  swimming");
    }

    @Override
    public void makeNoise() {
        System.out.println("The fish is making something");

    }
}
