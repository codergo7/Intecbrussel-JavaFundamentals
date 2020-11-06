package be.intecbrussel.exercise_7;

public class Circle extends Shape{

    private int radius;


    public Circle(Circle circle){
        this(circle.getRadius(), circle.getX(), circle.getY());

    }

    public Circle(int radius, int x, int y) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
