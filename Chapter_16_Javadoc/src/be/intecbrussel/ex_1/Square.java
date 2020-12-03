
/** The package <strong>be.intecbrussel.ex_1</strong> contains classes
 * and interfaces which represent graphical shapes.
 */
package be.intecbrussel.ex_1;

/** This class is square in a two dimensional area.
 * This class can be used the following way:
 * <pre>
 *     Square sqr = new Square(3);
 * </pre>
 * @author codergo7
 * @version 1.0
 * @see be.intecbrussel.ex_1.Rectangle
 */

public class Square extends Rectangle {

    /** The number of the angles. */
    public static final int ANGLES =4;

    /** The number of the instances. */
    public static int count;

    {
        count++;
    }

    public Square() {
    }

    public Square(int side) {
        super(side, side);
    }

    /**
     *
     * @param side The initial side of the square.
     * @param x The x position of the square.
     * @param y The y position of the square.
     * @throws   be.intecbrussel.ex_1.NegativeSizeException The side is negative
     */

    public Square(int side, int x, int y) {
        super(side, side, x, y);
    }

    public void setSide(int side) {
        super.setHeight(side);
        super.setWidth(side);
    }

    /** Returns the side if the square.
     * The side of the square can be set using
     * {@link be.intecbrussel.ex_1.Square#setSide}
     * @return The side of the square
     * @see be.intecbrussel.ex_1.Square#setSide
     */
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
