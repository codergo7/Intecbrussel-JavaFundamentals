package be.intecbrussel.car_association;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Car {

    private String brand;
    private int speed;
    private Color color;
    private Engine engine;
    private Person driver;
    private Person[] seats;

    // composition relationship between Car and Engine. If a car instance be removed then its engine instance be removed automatically
    {
        engine = new Engine();
    }

    //Constructors
    public Car(String brand, Color color) {
        this(brand, color, null);
    }

    public Car(String brand, Color color, Person driver) {

        this.brand = brand;
        this.color = color;
        this.driver = driver;
        this.speed = new Random().nextInt(300);
    }


    // this method regulates speed of the car. speed of the car can accelerate if car has a driver and it's fuel is more than zero
    public void accelerate(int speed) {
        if (this.driver == null || this.engine.getFuel() == 0) {
            this.speed = 0;
        } else this.speed += speed;
    }

    // this method changes the color of the car and returns the cost calling costRePaint method of Color
    public int rePaint(Color color) {
        this.color = color;
        return color.costRePaint(color.getRgb());
    }

    // sorts Persons by age
    public void sortPerson(Person[] passengers) {
        Collections.sort(Arrays.asList(passengers), new ComparatorByAge());
        //Arrays.sort(passengers, new ComparatorByAge());
    }

    // adds Person instance if this.seats has empty seat
    public void add(Person passenger) {
        if (this.seats[this.seats.length - 1] != null) {
            System.out.println("Sorry. There is no empty seat");
            return;
        }
        for (int i = 0; i < this.seats.length; i++) {
            if (this.seats[i] == null) {
                this.seats[i] = passenger;
                return;
            }
        }
    }

    // getters and setters
    public String getBrand() {
        return brand;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public Color getColor() {
        return color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Person getDriver() {
        return driver;
    }

    public void setDriver(Person driver) {
        this.driver = driver;
    }

    public Person[] getSeats() {
        return seats;
    }

    public void setSeats(Person[] seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Brand=" + brand +
                ", speed=" + speed +
                ", color=" + color.getName() +
                ", engine=" + engine.getFuelCapacity() + "L" +
                ", driver=" + driver.getName();
    }
}
