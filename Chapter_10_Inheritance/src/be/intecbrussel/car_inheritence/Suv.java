package be.intecbrussel.car_inheritence;

public class Suv extends Car{

    private boolean grillGuard;
    private boolean grannyGear;


    public Suv() {
        this("white", 0, 100,false);
    }

    public Suv(String color, int speed, int hp, boolean grillGuard) {
        super(color, speed, hp);
        this.grillGuard = grillGuard;
    }

    @Override
    public void accelerate(int amount){
        if(this.grannyGear&&this.getSpeed()>30){
            driving4x4(grannyGear);
        }
        else {
            super.accelerate(amount);
        }
    }

    public void  driving4x4(boolean grannyGear){
        this.grannyGear =grannyGear;
        if(grannyGear&& this.getSpeed()>30){
            this.slow(getSpeed()-30);
        }
    }

    public boolean isGrannyGear() {
        return grannyGear;
    }

    public boolean getGrillGuard() {
        return grillGuard;
    }

    public void setGrillGuard(boolean grillGuard) {
        this.grillGuard = grillGuard;
    }
}
