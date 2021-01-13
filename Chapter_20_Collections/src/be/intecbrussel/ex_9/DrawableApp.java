package be.intecbrussel.ex_9;

import java.util.Collection;
import java.util.Iterator;

public class DrawableApp {

    public static void main(String[] args) {

        Drawing drawing = new Drawing();

        drawing.add(new IsoscelesTriangle(4, 5));
        drawing.add(new Rectangle(6, 7));
        drawing.add(new Square(9));
        drawing.add(new Triangle(10, 11, 12));
        drawing.add(new Circle(13));

        System.out.println("Size: " + drawing.getSize());

        System.out.println("*******************************************");

        Collection<Drawable> drawables = drawing.getShapes();

        drawables.forEach(System.out::println);


    }
}
