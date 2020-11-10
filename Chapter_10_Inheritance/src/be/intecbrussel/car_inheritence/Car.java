package be.intecbrussel.car_inheritence;

public class Car {

    private String color;
    private int speed;
    private int hp;

    public Car() {
        this("white",  0);
    }

    public Car(String color, int hp) {
        this.color = color;
        this.hp = hp;
    }

    //without setSpeed method
    public void accelerate(int amount){
        this.speed += (Math.abs(amount) + hp/100);

    }
    public void slow(int amount){
        this.speed -= (Math.abs(amount) + hp/100);
    }

    public void park(){
        this.speed =0;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public int getHp() {
        return hp;
    }

    @Override
    public String toString() {
        return  "color=" + color +
                ", speed=" + speed +
                ", hp=" + hp;
    }
}
