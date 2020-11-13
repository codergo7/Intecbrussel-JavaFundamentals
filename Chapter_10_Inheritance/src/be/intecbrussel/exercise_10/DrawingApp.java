package be.intecbrussel.exercise_10;

import be.intecbrussel.exercise_8.*;

import java.util.Random;

public class DrawingApp {

    public static void main(String[] args) {

        Drawing drawing = new Drawing();

        for (int i = 0; i < 500; i++) {
            drawing.add(randomFillDrawingWithShapes());
        }
        System.out.println(drawing);
        System.out.println(drawing.getSize());





       /* System.out.println(drawing);

        drawing.add(new Circle(13));

        System.out.println("Size: " + drawing.getSize());

        drawing.remove(new Square(9));
        System.out.println("Size after remove: " + drawing.getSize());
        drawing.clear();
        System.out.println("Size after clear: " + drawing.getSize());
       */

    }

    public static Shape randomFillDrawingWithShapes() {
        Random random = new Random();

        int amountOfShape = random.nextInt(5);

        switch (amountOfShape) {
            case 0:
                return new Rectangle(random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100));
            case 1:
                return new Square(random.nextInt(100), random.nextInt(100), random.nextInt(100));
            case 2:
                return new Circle(random.nextInt(100), random.nextInt(100), random.nextInt(100));
            case 3:
                return new Triangle(random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100));
            case 4:
                return new IsoscelesTriangle(random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100));
        }
        return null;
    }
}
