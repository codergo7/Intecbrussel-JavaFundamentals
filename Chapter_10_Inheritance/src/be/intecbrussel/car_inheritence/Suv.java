package be.intecbrussel.car_inheritence;

public class Suv extends Car{

    private boolean bullbar;
    private boolean isAWDOn;

    public Suv() {
        this("white", 200);
    }

    public Suv(String color, int hp) {
        super(color,  hp);
    }

    //without setSpeed method
    @Override
    public void accelerate(int amount){
        if(this.isAWDOn &&this.getSpeed()+amount+getHp()/100>30){
            super.slow(getSpeed()+ getHp()/100 -30);
        }
        else {
            super.accelerate(amount);
        }
    }

    public void  driving4x4(boolean grannyGear){
        this.isAWDOn =grannyGear;
        if(grannyGear&& this.getSpeed()>30){
            this.slow(getSpeed()-30);
        }
    }

    public boolean isAWDOn() {
        return isAWDOn;
    }

    public boolean getBullbar() {
        return bullbar;
    }

    public void setBullbar(boolean bullbar) {
        this.bullbar = bullbar;
    }

    @Override
    public String toString() {
        return "Suv: " +
                "grillGuard=" + bullbar +
                ", grannyGear=" + isAWDOn +
                ", " + super.toString();
    }
}
