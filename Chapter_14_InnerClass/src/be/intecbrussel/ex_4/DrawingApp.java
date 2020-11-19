package be.intecbrussel.ex_4;

public class DrawingApp {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();
        DrawingContext drawingContext = new TextDrawingContext();

         drawing.add(new Rectangle(5,10));
         drawing.add(new Circle(15));
         drawing.add(new Triangle(25,30, 15));

         drawing.draw(drawingContext);
        System.out.println("*******************");
        drawing.scale(Scaleable.DOUBLE);
        drawing.draw(drawingContext);

    }
}
