package be.intecbrussel.exercise_1_6;

public class Rectangle {

    private static int count;

    private int height;
    private int width;
    private int x;
    private int y;

    {
        count++;
    }

    public Rectangle() {
        this(1,1,1,1);
    }

    public Rectangle(int height, int width) {
        this(height,width,1,1);
    }

    // height and width can not be negative
    public Rectangle(int height, int weight, int x, int y) {
        this.height = Math.abs(height);
        this.width = Math.abs(weight);
        this.x = x;
        this.y = y;
    }

    public int getArea(){
        return this.height*this.width;
    }

    public int getPerimeter(){
        return 2*(this.height + this.width);
    }


    //getters and setters
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

    // height can not be negative
    public void setHeight(int height) {
        this.height = Math.abs(height);
    }

    public int getWidth() {
        return width;
    }

    //width can not be negative
    public void setWidth(int width) {
        this.width = Math.abs(width);
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

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
