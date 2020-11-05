package be.intecbrussel.exercise_1_6;

public class Square extends Rectangle{


    public Square() {
    }

    public Square(int height, int weight, int x, int y) {
        super(height, weight, x, y);
    }

    public void setSide(int side){
        super.setHeight(side);
        super.setWidth(side);
    }

    public int getSide(){
        return super.getHeight();
    }
}
