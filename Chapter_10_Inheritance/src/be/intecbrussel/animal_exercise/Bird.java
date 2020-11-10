package be.intecbrussel.animal_exercise;

public class Bird extends Animal{

    public Bird() {
    }

    public Bird(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("The bird is flying");
    }

    @Override
    public void makeNoise() {
        System.out.println("The bird is singing");

    }
}
