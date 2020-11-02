package be.intecbrussel.ex_car;

public class Car {

    private String brand;
    private int speed;
    private Color color;
    private Engine engine;
    private Person driver;




    public void accelerate(int speed) {
        this.speed = speed;
    }

    public void tune(int speed) {
        this.speed = speed;
    }

    public void rePaint(Color color) {
        this.color = color;
    }


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
}
