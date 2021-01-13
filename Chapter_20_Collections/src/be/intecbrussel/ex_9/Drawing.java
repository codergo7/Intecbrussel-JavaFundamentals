package be.intecbrussel.ex_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Drawing implements Drawable {

    private Collection<Drawable> shapes;

    {
        shapes = new ArrayList<>();
    }

    public void add(Drawable drawable) {
        shapes.add(drawable);
    }

    public void remove(Drawable drawable) {
        shapes.remove(drawable);
    }

    // fills null in all shapes array
    public void clear() {
        shapes.clear();
    }

    public int getSize() {
        return shapes.size();
    }

    public Collection<Drawable> getShapes() {
        return shapes;
    }

    @Override
    public String toString() {
        return "Drawing{" +
                "shapes=" + shapes.toString() +
                '}';
    }

    @Override
    public void draw(DrawingContext dc) {
        for (Drawable drawable : shapes) {
            if (drawable != null) {
                drawable.draw(dc);
            }
        }
    }

    @Override
    public void scale(int s) {
        for (Drawable drawable : shapes) {
            if (drawable != null) {
                drawable.scale(s);
            }
        }
    }
}
