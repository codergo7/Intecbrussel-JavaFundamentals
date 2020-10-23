package intecbrussel;

public class RectangleApp {
    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(10,10);

        System.out.println(rect1.getArea());
        System.out.println(rect2.getArea());
    }
}
