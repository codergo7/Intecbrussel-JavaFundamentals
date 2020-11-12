package be.intecbrussel.exercise_10;

import be.intecbrussel.exercise_8.*;

public class DrawingApp {

    public static void main(String[] args) {

        Drawing drawing = new Drawing();

        drawing.add(new IsoscelesTriangle(4,5));
        drawing.add(new Rectangle(6,7));
        drawing.add(new Square(9));
        drawing.add(new Triangle(10,11,12));
        drawing.add(new Circle(13));
        System.out.println("Size: " + drawing.getSize());

        drawing.add(new Circle(13));

        System.out.println("Size: " + drawing.getSize());

        drawing.remove(new Square(9));
        System.out.println("Size after remove: " + drawing.getSize());


    }
}
