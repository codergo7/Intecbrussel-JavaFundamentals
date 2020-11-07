package be.intecbrussel.car_inheritence;

public class Cabrio extends Car {

    private boolean sunroof;

    public Cabrio() {
        this("white", 0, 100,false);
    }

    public Cabrio(String color, int speed, int hp, boolean sunroof) {
        super(color, speed, hp);
        this.sunroof = sunroof;
    }

    public boolean getSunroof() {
        return sunroof;
    }

    public void openRoof(boolean sunroof) {
        this.sunroof = sunroof;
    }

    @Override
    public String toString() {
        return super.toString() +  ", sunroof=" + sunroof;
    }
}
