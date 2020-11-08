package be.intecbrussel.exercise_7;

public class Triangle extends Shape{

    private static int count;
    private int height;
    private int width;
    private int perpendicular;

    {
        count++;
    }

    public Triangle(int width, int height, int perpendicular) {
        this( width,height,perpendicular,1,1);
    }

    public Triangle( int width,int height,  int perpendicular, int x, int y) {
        super(x, y);
        this.width = width;
        this.height = height;
        this.perpendicular = perpendicular;
    }

    @Override
    public double getArea() {
        return width*height/2;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    // getters and setters
    public static int getCount() {
        return count;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getPerpendicular() {
        return perpendicular;
    }

    public void setPerpendicular(int perpendicular) {
        this.perpendicular = perpendicular;
    }
}
