package be.intecbrussel.exercise_7;

public class IsoscelesTriangle extends Triangle {

    public IsoscelesTriangle(int width, int perpendicular) {
        super(width, perpendicular, perpendicular);
    }

    public IsoscelesTriangle(int width, int perpendicular, int x, int y) {
        super(width, perpendicular, perpendicular, x, y);
    }

}
