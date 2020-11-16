package be.intecbrussel.ex_13_1;

public class ShapeApp {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(23, 44);
        rectangle.scale(Scaleable.DOUBLE);

        System.out.println(rectangle);
    }
}
