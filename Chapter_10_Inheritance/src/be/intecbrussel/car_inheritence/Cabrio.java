package be.intecbrussel.car_inheritence;

public class Cabrio extends Car {

    private boolean sunroof;

    public Cabrio() {
        this("white",  100);
    }

    public Cabrio(String color,  int hp) {
        super(color, hp);

    }

    public boolean getSunroof() {
        return sunroof;
    }

    public void openRoof(boolean sunroof) {
        this.sunroof = sunroof;
    }

    @Override
    public String toString() {
        return "Cabrio: " +
                "sunroof=" + sunroof +
                ", " + super.toString();
    }
}
