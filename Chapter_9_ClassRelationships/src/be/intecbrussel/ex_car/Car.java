package be.intecbrussel.ex_car;

public class Car {

    private String brand;
    private int speed;
    private Color color;
    private Engine engine;
    private Person driver;

    {
        engine = new Engine();
    }


    public Car(String brand, Color color) {
        this(brand,0, color, null);
    }

    public Car(String brand, Color color, Person driver) {
        this(brand,0, color, driver);
    }


    public Car(String brand, int speed, Color color, Person driver) {
        this.brand = brand;
        this.speed = speed;
        this.color = color;
        this.driver = driver;
        //this.engine = new Engine();
    }

    public void accelerate(int speed) {
        if(this.driver != null && this.engine.getFuel()>0){
            this.speed += speed;
        }
    }

    public void tune(int speed) {
        this.speed = speed;
    }

    public void rePaint(Color color) {
        color.costRePaint(color.getRgb());
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
