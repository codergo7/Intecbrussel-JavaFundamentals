package be.intecbrussel.ex_13_2;

public class Square extends Rectangle {

    public static final int ANGLES =4;
    public static int count;

    {
        count++;
    }

    public Square() {
    }

    public Square(int side) {
        super(side, side);
    }

    public Square(int side, int x, int y) {
        super(side, side, x, y);
    }

    public void setSide(int side) {
        super.setHeight(side);
        super.setWidth(side);
    }

    public int getSide() {
        return super.getHeight();
    }

    @Override
    public void setHeight(int height) {
        setSide(height);
    }

    @Override
    public void setWidth(int width) {
        setSide(width);
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Square{" + "side=" + getSide() +
                ", x=" + getX() +
                ", y=" + getY() +
                '}';
    }
}
