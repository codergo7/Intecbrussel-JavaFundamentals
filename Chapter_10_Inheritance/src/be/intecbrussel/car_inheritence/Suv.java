package be.intecbrussel.car_inheritence;

public class Suv extends Car{

    private boolean bullbar;


    public Suv() {
        this("white", 0, 100,false);
    }

    public Suv(String color, int speed, int hp, boolean bullbar) {
        super(color, speed, hp);
        this.bullbar = bullbar;
    }

    public void  driving4x4(boolean drive){

    }

    public boolean isBullbar() {
        return bullbar;
    }

    public void setBullbar(boolean bullbar) {
        this.bullbar = bullbar;
    }
}
