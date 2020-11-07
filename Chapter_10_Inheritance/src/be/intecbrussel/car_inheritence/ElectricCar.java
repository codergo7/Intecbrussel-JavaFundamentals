package be.intecbrussel.car_inheritence;

public class ElectricCar extends Car {

    private int battery;

    public ElectricCar() {
        this("white", 0, 100,0);
    }

    public ElectricCar(String color, int speed, int hp, int battery) {
        super(color, speed, hp);
        this.battery = battery;
    }

    public int getBattery() {
        return battery;
    }

    public void charge(int battery) {
        this.battery = battery;
    }
}
