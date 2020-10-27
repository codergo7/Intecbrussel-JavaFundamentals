package intecbrussel;

public class Rectangle {
    public static int amountOfRectangles;
    private int height;
    private int weight;
    private int xPos;
    private int yPos;

    {
        amountOfRectangles += 10;
    }

    public Rectangle() {
        this(1, 1, 1, 1);
    }

    public Rectangle(int height, int weight) {
        this(height, weight, 1, 1);
    }

    public Rectangle(int height, int weight, int xPos, int yPos) {
        amountOfRectangles++;
        this.height = height > 0 ? height : -height;
        this.weight = weight > 0 ? weight : -weight;
        this.xPos = Math.abs(xPos);
        this.yPos = Math.abs(xPos);
    }

    public Rectangle(Rectangle rectangle) {
        this(rectangle.height, rectangle.weight, rectangle.xPos, rectangle.yPos);
    }

    public int getPerimeter() {
        return 2 * (height + weight);
    }

    public int getArea() {
        return height * weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height > 0 ? height : this.height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight > 0 ? weight : this.weight;
    }

    public void setPosition(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public int[] getPosition() {
        return new int[]{this.xPos, this.yPos};
    }

    public int getXPos() {
        return xPos;
    }

    public void setXPos(int xPos) {
        this.xPos = xPos;
    }

    public int getYPos() {
        return yPos;
    }

    public void setYPos(int yPos) {
        this.yPos = yPos;
    }
}
