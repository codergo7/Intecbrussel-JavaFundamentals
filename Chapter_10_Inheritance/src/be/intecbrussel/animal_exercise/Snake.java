package be.intecbrussel.animal_exercise;

public class Snake extends Animal{

    public Snake() {
    }

    public Snake(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("The snake is crawling");
    }

    @Override
    public void makeNoise() {
        System.out.println("The snake is making \"sssss\"");

    }
}
