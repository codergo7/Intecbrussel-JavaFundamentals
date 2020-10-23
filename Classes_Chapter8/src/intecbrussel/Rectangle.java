package intecbrussel;

public class Rectangle {
    private int height;
    private int weight;
    private int xPos;
    private int yPos;



    public Rectangle() {
        this(1,1,1,1);
    }
    public Rectangle(int height, int weight) {
       this(height,weight,1,1);
    }

    public Rectangle(int height, int weight, int xPos, int yPos) {
       this.height = height;
       this.weight = weight;
        this.xPos = xPos;
        this.yPos = yPos;
    }



    public int getPerimeter(){
        return 2*(height+weight);
    }
    public int getArea(){
        return height*weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if(height>0)
            this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(weight > 0)this.weight = weight;
    }

    public void setPosition(int xPos, int yPos){
        this.xPos=xPos;
        this.yPos=yPos;
    }

    public int[] getPosition(){
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
