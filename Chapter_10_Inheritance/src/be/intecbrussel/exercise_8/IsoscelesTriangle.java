package be.intecbrussel.exercise_8;

public class IsoscelesTriangle extends Triangle {

    public IsoscelesTriangle(int width, int height) {
        super(width, height, height);
    }

    public IsoscelesTriangle(int width, int height, int x, int y) {
        super(width, height, height, x, y);
    }

    @Override
    public double getPerimeter() {
        return getWidth() + Math.sqrt(Math.pow(getWidth()/2,2)+ Math.pow(getHeight(),2));
    }

    @Override
    public void setPerpendicular(int perpendicular) {
        super.setHeight(perpendicular);
    }

    @Override
    public String toString() {
        return "IsoscelesTriangle{"+
                "height=" + getHeight() +
                ", width=" + getHeight() +
                "x= " + getX() + ", y=" + getY() + "}";
    }
}
