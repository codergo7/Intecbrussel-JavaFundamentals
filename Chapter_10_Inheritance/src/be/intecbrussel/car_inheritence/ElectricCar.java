package be.intecbrussel.car_inheritence;

public class ElectricCar extends Car {

    private int battery;

    public ElectricCar() {
        this("white", 0, 70,50);
    }

    public ElectricCar(String color, int speed, int hp, int battery) {
        super(color, speed, hp);
        this.battery = battery;
    }

    @Override
    public void accelerate(int amount){
        super.accelerate (amount + this.battery/100-getHp()/100);
    }

    public int getBattery() {
        return battery;
    }

    public void charge(int battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return super.toString() + ", battery=" + battery;
    }
}
