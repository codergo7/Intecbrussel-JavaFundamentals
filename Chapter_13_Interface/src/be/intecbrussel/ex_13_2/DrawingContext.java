package be.intecbrussel.ex_13_2;

public interface DrawingContext {

    void draw(Rectangle rectangle);

    void draw(Circle circle);

    default void draw(Triangle triangle) {

    }


}
