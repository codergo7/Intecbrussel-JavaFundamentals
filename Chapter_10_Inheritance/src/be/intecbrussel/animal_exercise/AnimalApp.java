package be.intecbrussel.animal_exercise;

public class AnimalApp {

    public static void main(String[] args) {
        Animal[] animals = {new Snake(), new Bird(),new Cat(), new Fish()};

        for (Animal animal:animals) {
            animal.makeNoise();
            animal.move();
        }

    }
}
