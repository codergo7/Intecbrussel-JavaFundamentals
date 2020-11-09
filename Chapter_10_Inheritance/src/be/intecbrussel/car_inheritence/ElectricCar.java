package be.intecbrussel.car_inheritence;

public class ElectricCar extends Car {

    private int battery;

    public ElectricCar() {
        this("white",  70, 50);
    }

    public ElectricCar(String color, int hp, int battery) {
        super(color,  hp);
        this.battery = battery;
    }

    //without setSpeed method
    @Override
    public void accelerate(int amount) {
        super.accelerate(Math.abs(amount) + this.battery / 100 - getHp() / 100);
    }

    //without setSpeed method
    @Override
    public void slow(int amount) {
        super.slow(Math.abs(amount) - this.battery / 100 + getHp() / 100);
    }

    public int getBattery() {
        return battery;
    }

    public void charge(int amount) {
        if (this.battery + amount > 100) {
            this.battery = 100;
        } else {
            this.battery += amount;

        }
    }

    @Override
    public String toString() {
        return "ElectricCar: " +
                "battery=" + battery +
                ", " + super.toString();
    }
}
