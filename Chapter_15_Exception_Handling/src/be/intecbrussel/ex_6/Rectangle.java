package be.intecbrussel.ex_6;

public class Rectangle extends Shape {

    public static final int ANGLES = 4;
    public static int count;

    private int height;
    private int width;

    {
        count++;
    }

    public Rectangle() {
        this(1, 2, 1, 1);
    }

    public Rectangle(int height, int width) {
        this(height, width, 1, 1);
    }

    // height and width can not be negative
    public Rectangle(int height, int weight, int x, int y) {
        this.height = Math.abs(height);
        this.width = Math.abs(weight);
        super.setX(x);
        super.setY(y);
    }

    @Override
    public double getArea() {
        return this.height * this.width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.height + this.width);
    }

    //getters and setters
    public void setPosition(int x, int y) {
        super.setX(x);
        super.setY(y);
    }

    public int[] getPosition() {
        return new int[]{getX(), getY()};
    }

    public int getHeight() {
        return height;
    }

    // height can not be negative
    public void setHeight(int height) {
        this.height = Math.abs(height);
    }

    public int getWidth() {
        return width;
    }

    //width can not be negative
    public void setWidth(int width) {
        this.width = Math.abs(width);
    }


    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width + " "
                + super.toString() + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return height == rectangle.getHeight() &&
                width == rectangle.getWidth() &&
                getX() == rectangle.getX() &&
                getY() == rectangle.getY();
    }

    @Override
    public int hashCode() {
        return super.hashCode() + height * 23 + width * 29;
    }
}
