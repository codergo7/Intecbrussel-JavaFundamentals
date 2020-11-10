package be.intecbrussel.exercise_8;

import java.util.Objects;

public class Triangle extends Shape {

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
        return Math.sqrt(Math.pow(this.width-this.perpendicular,2) + Math.pow(this.height, 2)) +
                Math.sqrt(Math.pow(this.perpendicular,2) + Math.pow(this.height, 2)) + this.width;
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

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", width=" + width +
                ", perpendicular=" + perpendicular +
                super.toString()+ "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Triangle triangle = (Triangle) o;
        return height == triangle.height &&
                width == triangle.width &&
                perpendicular == triangle.perpendicular
                && getX() == triangle.getX()
                && getY()== triangle.getY();
    }

    @Override
    public int hashCode() {
        return super.hashCode() + height*31 + width*37 +  perpendicular*41;
    }
}
