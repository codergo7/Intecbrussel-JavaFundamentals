package be.intecbrussel.exercise_8;

import java.util.Objects;

public class Circle extends Shape {

    public static final int ANGLES =0;
    public static int count;
    private int radius;

    {
        count++;
    }


    public Circle(Circle circle){
        this(circle.getRadius(), circle.getX(), circle.getY());
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(int radius, int x, int y) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2*radius*Math.PI;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius  + super.toString() +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return radius == circle.getRadius()
                && getX() == circle.getX()
                && getY()== circle.getY();
    }

    @Override
    public int hashCode() {
        return super.hashCode() + getRadius()*19;
    }
}
