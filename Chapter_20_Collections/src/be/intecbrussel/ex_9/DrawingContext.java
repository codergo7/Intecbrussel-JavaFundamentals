package be.intecbrussel.ex_9;

public interface DrawingContext {

    void draw(Rectangle rectangle);

    void draw(Circle circle);

    default void draw(Triangle triangle) {

    }


}
