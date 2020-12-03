package be.intecbrussel.ex_1;

public class Triangle extends Shape {

    private static int count;
    private int height;
    private int width;
    private int perpendicular;

    {
        count++;
    }

    public Triangle(int width, int height, int perpendicular) {
        this(width, height, perpendicular, 1, 1);
    }

    public Triangle(int width, int height, int perpendicular, int x, int y) throws NegativeSizeException {
        super(x, y);
        if(height<0){
            throw new NegativeSizeException("Height can not be negative");
        }
        if(width<0){
            throw new NegativeSizeException("Width can not be negative");
        }
        if(perpendicular<0){
            throw new NegativeSizeException("Perpendicular can not be negative");
        }
        this.width = width;
        this.height = height;
        this.perpendicular = perpendicular;
    }

    @Override
    public double getArea() {
        return width * height / 2;
    }

    @Override
    public double getPerimeter() {
        double hypotenuse1 = Math.hypot(this.height, this.perpendicular);
        double hypotenuse2 = Math.hypot(this.height, (this.width - this.perpendicular));
        return this.width + hypotenuse1 + hypotenuse2;

    }

    // getters and setters
    public static int getCount() {
        return count;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) throws NegativeSizeException {
        if(height<0){
            throw new NegativeSizeException("Height can not be negative");
        }
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if(width<0){
            throw new NegativeSizeException("Width can not be negative");
        }
        this.width = width;
    }

    public int getPerpendicular() {
        return perpendicular;
    }

    public void setPerpendicular(int perpendicular) {
        if(perpendicular<0){
            throw new NegativeSizeException("Perpendicular can not be negative");
        }
        this.perpendicular = perpendicular;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", width=" + width +
                ", perpendicular=" + perpendicular +
                super.toString() + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Triangle triangle = (Triangle) o;
        return height == triangle.getHeight() &&
                width == triangle.getWidth() &&
                perpendicular == triangle.getPerpendicular()
                && getX() == triangle.getX()
                && getY() == triangle.getY();
    }

    @Override
    public int hashCode() {
        return super.hashCode() + getHeight() * 31 + getWidth() * 37 + getPerpendicular() * 41;
    }
}
