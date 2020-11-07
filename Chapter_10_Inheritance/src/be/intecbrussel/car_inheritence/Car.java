package be.intecbrussel.car_inheritence;

public class Car {

    private String color;
    private int speed;
    private int hp;

    public Car() {
        this("white", 0, 100);
    }

    public Car(String color, int speed, int hp) {
        this.color = color;
        this.speed = speed;
        this.hp = hp;
    }

    public void accelerate(int amount){
        this.speed += (amount + hp/100);
    }
    public void slow(int amount){
        this.speed -= (amount + hp/100);
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

}
