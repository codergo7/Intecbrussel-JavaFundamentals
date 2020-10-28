package intecbrussel;

public class CircleApp {

    public static void main(String[] args) {
        Circle[] circles = new Circle[4];
        circles[0] = new Circle(2);
        circles[1] = new Circle();
        circles[2] = new Circle(3);
        circles[3] = new Circle(4);

        for(Circle circle: circles){
            System.out.println("Radius: "+ circle.getRadius() + " Area: " + circle.getArea() + " Perimeter: " + circle.getPerimeter());
        }

        System.out.println("\n Amount of circles: " +  Circle.amountOfCircles);
    }
}
