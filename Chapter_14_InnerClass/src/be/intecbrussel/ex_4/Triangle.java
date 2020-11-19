package be.intecbrussel.ex_4;

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

    public Triangle(int width, int height, int perpendicular, int x, int y) {
        super(x, y);
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
     /*
        return Math.sqrt(Math.pow(this.width - this.perpendicular, 2) + Math.pow(this.height, 2)) +
                Math.sqrt(Math.pow(this.perpendicular, 2) + Math.pow(this.height, 2)) + this.width;
         */
    }

    // getters and setters
    public static int getCount() {
        return count;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getPerpendicular() {
        return perpendicular;
    }

    public void setPerpendicular(int perpendicular) {
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


    @Override
    public void scale(int s) {
        this.height *= ((double) s)/100;
        this.width *= ((double) s)/100;
        this.perpendicular *= ((double) s)/100;
    }

    @Override
    public void draw(DrawingContext dc) {
        dc.draw(this);
    }


}
