package be.intecbrussel.ex_4;

import java.util.Iterator;

public class DrawableApp {

    public static void main(String[] args) {

        Drawing drawing = new Drawing();

        drawing.add(new IsoscelesTriangle(4, 5));
        drawing.add(new Rectangle(6, 7));
        drawing.add(new Square(9));
        drawing.add(new Triangle(10, 11, 12));
        drawing.add(new Circle(13));

        System.out.println("Size" + drawing.getSize());

        Iterator<Drawable> iterator = drawing.iterator();

        while (iterator.hasNext()){

            System.out.println(iterator.next());
        }

        System.out.println("*******************************************");

        for(Drawable drawable : drawing){
            System.out.println(drawable);
        }


    }
}
