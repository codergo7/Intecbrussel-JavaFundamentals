package intecbrussel;

public class RectangleApp {
    public static void main(String[] args) {

        Rectangle myRectangle = new Rectangle(10,10);

        System.out.println("Weigt: " + myRectangle.getWeight());
        System.out.println(myRectangle.getArea());
        System.out.println(myRectangle.getPerimeter());
    }
}
