package be.intecbrussel.ex_2;

public class Musician {

    public Object getInstrument() {
        class Instrument {

            public String toString() {
                return "The instrument makes a sound";
            }
        }
        return new Instrument();
    }
}
