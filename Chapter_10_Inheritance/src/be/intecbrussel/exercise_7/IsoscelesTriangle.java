package be.intecbrussel.exercise_7;

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
        super.setPerpendicular(perpendicular);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setPerpendicular(height);
    }
}
