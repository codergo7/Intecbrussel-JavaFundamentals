package be.intecbrussel.exercise_8;

public class ShapeApp {

    public static void main(String[] args) {

        Shape[] shapes = {new IsoscelesTriangle(4, 5),
                new Rectangle(6, 7),
                new Square(9),
                new Triangle(10, 11, 12),
                new Circle(13)};


        for (Shape shape : shapes) {
            System.out.println(shape.hashCode());
        }

    }
}
