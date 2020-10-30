package intecbrussel.examples;

public class Circle {
    private int radius;
    public static int amountOfCircles;

    {
        amountOfCircles++;
    }

    public Circle() {
        this(1);
    }

    public Circle(int radius) {
        this.radius = radius;
    }
    public double getArea(){

        return Math.pow(this.radius,2)*Math.PI;
    }

    public double getPerimeter(){

        return 2*this.radius*Math.PI;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
