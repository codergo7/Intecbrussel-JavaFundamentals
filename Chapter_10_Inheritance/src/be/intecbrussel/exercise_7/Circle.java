package be.intecbrussel.exercise_7;

public class Circle extends Shape{

    public static final int ANGLES =0;
    public static int count;
    private int radius;

    {
        count++;
    }


    public Circle(Circle circle){
        this(circle.getRadius(), circle.getX(), circle.getY());

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
}
