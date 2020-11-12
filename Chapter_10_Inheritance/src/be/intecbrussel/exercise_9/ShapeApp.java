package be.intecbrussel.exercise_9;

import be.intecbrussel.exercise_8.*;

public class ShapeApp {

    public static void main(String[] args) {
        Shape[] shapes = {new IsoscelesTriangle(4,5),
                new Rectangle(6,7),
                new Square(9),
                new Triangle(10,11,12),
                new Circle(13)};
        print(shapes);
    }
    public static void print(Shape[] shapes){
        for(Shape shape:shapes){
            System.out.println(shape);
            System.out.println("Perimeter: "+ shape.getPerimeter());
            System.out.println("Position: x=" + shape.getX() + ", y=" + shape.getY());
            System.out.println("\nArea: " + shape.getArea());

            if(shape instanceof Square){
                Square square = (Square) shape;
                System.out.println("Area: " + square.getArea());
            }
            else if(shape instanceof Rectangle){
                Rectangle rectangle = (Rectangle) shape;
                System.out.println("Area: " + rectangle.getArea());
            }
            else if(shape instanceof Triangle){
                Triangle triangle = (Triangle) shape;
                System.out.println("Area: " + triangle.getArea());
            }
            else if(shape instanceof IsoscelesTriangle){
                IsoscelesTriangle isoscelesTriangle = (IsoscelesTriangle) shape;
                System.out.println("Area: " + isoscelesTriangle.getArea());
            }
            else if(shape instanceof Circle){
                Circle circle = (Circle) shape;
                System.out.println("Area: " + circle.getArea());
            }
            System.out.println("*********************************************");
        }
    }


}
