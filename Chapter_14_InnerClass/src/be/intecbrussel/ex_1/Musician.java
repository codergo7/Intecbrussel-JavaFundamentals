package be.intecbrussel.ex_1;

public class Musician {

    public void play(){
        Instrument instrument = new Instrument();
        System.out.println("Musician plays an instrument");
        instrument.makeSound();
    }

    class Instrument{

        public void makeSound(){
            System.out.println("The instrument makes a sound\n");
        }
    }
}
