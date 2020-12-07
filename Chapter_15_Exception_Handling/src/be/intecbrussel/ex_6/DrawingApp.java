package be.intecbrussel.ex_6;

import java.util.Random;

public class DrawingApp {

    public static void main(String[] args) {

        Drawing drawing = new Drawing();

        for (int i = 0; i < 20; i++) {
            drawing.add(randomFillDrawingWithShapes());
        }

        Drawing.DrawableIterator iterator = drawing.new DrawableIterator();

        try {
            while (iterator.hasNext()) {
                Shape shape = iterator.next();
                if (shape instanceof Circle) {
                    ((Circle) shape).setRadius(-5);
                } else if (shape instanceof Rectangle) {
                    ((Rectangle) shape).setHeight(-10);
                } else {
                    ((Triangle) shape).setHeight(-7);
                }
            }
        } catch (NegativeSizeException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
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
