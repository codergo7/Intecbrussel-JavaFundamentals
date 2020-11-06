package be.intecbrussel.exercise_1_6;

public class SquareApp {

    public static void main(String[] args) {

        Square square1 = new Square();
        System.out.println(square1);
        //square1.setSide(-5);
        square1.setPosition(3,4);
        System.out.println(square1);
        System.out.println("Area= " + square1.getArea());
        System.out.println("Perimeter= " + square1.getPerimeter());

        Square square2 = new Square(7,-1,4);
        square2.setHeight(9);
        System.out.println(square2);
        System.out.println("Area= " + square2.getArea());
        System.out.println("Perimeter= " + square2.getPerimeter());
        Rectangle rectangle = new Rectangle();
        Rectangle rect = new Square();

        System.out.println("Rectangle count: " + Rectangle.getCount()); // 3
        System.out.println("Square count: " + Square.getCount());       // 2

    }
}
