package be.intecbrussel.ex_9;

public class IsoscelesTriangle extends Triangle {

    private static int count;

    {
        count++;
    }

    public IsoscelesTriangle(int width, int height) {
        super(width, height, width / 2);
    }

    public IsoscelesTriangle(int width, int height, int x, int y) {
        super(width, height, width / 2, x, y);
    }


    @Override
    public void setPerpendicular(int perpendicular) {
        super.setPerpendicular(perpendicular);
        super.setWidth(2 * perpendicular);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setPerpendicular(width / 2);
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "IsoscelesTriangle{" +
                "height=" + getHeight() +
                ", width=" + getHeight() +
                "x= " + getX() + ", y=" + getY() + "}";
    }
}
