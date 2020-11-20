package be.intecbrussel.ex_4;

import java.util.Arrays;
import java.util.Iterator;

public class Drawing implements Drawable, Iterable<Drawable> {

    private Drawable[] shapes;
    private int size;

    {
        shapes = new Drawable[100];
    }

    public void add(Drawable drawable) {
        if(size==shapes.length-5){
            enlargeList();
        }
        int index;
        boolean bool = isPresent(drawable);
        if (!(bool = isPresent(drawable)) && (index = getFreeLocation()) != -1) {
            shapes[index] = drawable;
            size++;
        }

    }

    private void enlargeList() {
        shapes = Arrays.copyOf(shapes,shapes.length+50);
    }

    // checks whether shape parameter is the shapes list
    private boolean isPresent(Drawable drawable) {
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] != null && shapes[i].equals(drawable)) {
                return true;
            }
        }
        return false;
    }

    // gets first index of null value in de shapes array
    private int getFreeLocation() {
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public void remove(Drawable drawable) {
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] != null && shapes[i].equals(drawable)) {
                shapes[i] = null;
                size--;
                break;
            }
        }
    }

    // fills null in all shapes array
    public void clear() {
        Arrays.fill(shapes, null);
        //shapes = new Shape[100];
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public Drawable[] getShapes() {
        return shapes;
    }

    @Override
    public String toString() {
        return "Drawing{" +
                "shapes=" + Arrays.toString(shapes) +
                '}';
    }

    @Override
    public void draw(DrawingContext dc) {
      for (Drawable drawable : shapes){
          if(drawable != null){
              drawable.draw(dc);
          }
      }
    }

    @Override
    public void scale(int s) {
        for (Drawable drawable : shapes){
            if(drawable != null){
                drawable.scale(s);
            }
        }
    }

    @Override
    public Iterator iterator() {

        return new DrawableIterator();
    }
    class DrawableIterator implements Iterator<Drawable>{

        private int index;

        @Override
        public boolean hasNext() {

            return getSize()>index;
        }

        @Override
        public Drawable next() {
            return shapes[index++];
        }
    }


}
