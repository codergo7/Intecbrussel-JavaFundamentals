package intecbrussel.car_assignment;

public class Car {

    public static int amountOfCar;
    private double speed;
    private int hp;
    private String color;
    private boolean light;

    {
        amountOfCar++;
    }

    public Car() {
        this(100, 0, "white", false);
    }

    public Car(int hp) {
        this(hp, 0, "white", false);
    }

    public Car(double speed) {
        this(100, speed, "white", false);
    }

    public Car(String color) {
        this(100, 0, color, false);
    }

    public Car(int hp, String color) {
        this(hp, 0, color, false);
    }

    public Car(int hp, boolean light) {
        this(hp, 0, "white", light);
    }

    public Car(int hp, String color, boolean light) {
        this(hp, 0, color, light);
    }

    public Car(int hp, double speed, String color, boolean light) {
        this.hp = hp;
        this.speed = speed;
        this.color = color;
        this.light = light;
    }

    public void lightToggle(boolean light) {
        this.light = light;
    }

    public void speed(double speed) {
        if (this.speed + speed < 0) {
            this.speed = 0;
        } else {
            this.speed += speed;
        }
    }

    public void park() {
        this.speed = 0;
        this.light = false;
    }

    public int rePaint(String color) {
        this.color = color;

        return costPaint(color);
    }

    private int costPaint(String color) {
        int cost = 0;
        for (int i = 0; i < color.length(); i++) {
            cost += color.charAt(i);
        }
        return cost;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getColor() {
        return color;
    }

    public boolean isLight() {
        return light;
    }

    public void setLight(boolean light) {
        this.light = light;
    }

    public void print() {
        System.out.println("Color: " + this.color + ", Hp: " + this.hp + ", Speed: " + this.speed + ", Light status: " + this.light);
    }
}
