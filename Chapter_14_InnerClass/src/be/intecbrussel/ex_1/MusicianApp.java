package be.intecbrussel.ex_1;

public class MusicianApp {

    public static void main(String[] args) {
        Musician musician = new Musician();
        musician.play();

        Musician.Instrument instrument = musician.new Instrument();
        instrument.makeSound();
    }
}
