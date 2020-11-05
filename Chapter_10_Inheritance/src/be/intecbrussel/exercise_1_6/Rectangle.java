package be.intecbrussel.exercise_1_6;

public class Rectangle {

    private int height;
    private int weight;
    private int x;
    private int y;

    public Rectangle() {
        this(1,1,1,1);
    }

    public Rectangle(int height, int weight, int x, int y) {
        this.height = height;
        this.weight = weight;
        this.x = x;
        this.y = y;
    }

    public int gerArea(){
        return this.height*this.weight;
    }

    public int gerPerimeter(){
        return 2*(this.height + this.weight);
    }

    public void setPosition(int x, int y){
        this.x =x;
        this.y =y;
    }

    public int[] getPosition(){
        return new int[]{this.x,this.y};
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
