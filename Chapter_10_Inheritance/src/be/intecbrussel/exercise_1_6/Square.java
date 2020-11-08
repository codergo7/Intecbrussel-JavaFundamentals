package be.intecbrussel.exercise_1_6;

public class Square extends Rectangle{

   public static int count;

    {
        count++;
    }

    public Square() {
    }

    public Square(int side) {
        super(side,side);
    }

    public Square(Square square){
        this(square.getSide(),square.getX(), square.getY());
    }

    public Square(int side, int x, int y) {
       super(side, side, x, y);
    }

    public void setSide(int side){
        super.setHeight(side);
        super.setWidth(side);
    }

    public int getSide(){
        return getHeight();
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
