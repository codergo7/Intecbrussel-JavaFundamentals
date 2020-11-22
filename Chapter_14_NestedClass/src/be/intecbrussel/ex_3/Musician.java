package be.intecbrussel.ex_3;

public class Musician {

    public Instrument getInstrument() {

        class Guitar implements Instrument {

            @Override
            public void play() {
                System.out.println("The guitar makes a sound so good.");
            }
        }
        return new Guitar();
    }
}
