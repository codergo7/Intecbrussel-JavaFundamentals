package be.intecbrussel.ex_1;

public class Musician {

    public void play() {
        Instrument instrument = new Instrument();
        instrument.makeSound();
    }

    public class Instrument {

        public void makeSound() {
            System.out.println("The instrument makes a sound\n");
        }

        public void makeNoise() {
            System.out.println("The instrument makes a noise");

        }
    }
}
