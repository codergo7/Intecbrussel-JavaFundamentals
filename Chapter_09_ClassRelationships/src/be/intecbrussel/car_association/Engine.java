package be.intecbrussel.car_association;

public class Engine {

    private int fuelCapacity;
    private double fuel;

    public Engine() {
    }

    public Engine(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }


    //takes fuel and updates fuel data
    public void reFuel(int fuel) {
        if(this.fuel+fuel > fuelCapacity){
            this.fuel = fuelCapacity;
        }
        else {
            this.fuel += fuel;
        }
    }

    //consumes the fuel and updates fuel data
    public void burnFuel(int speed) {
        if(this.fuel - speed*0.1 >0){
            this.fuel -= speed*0.1;
        }
    }

    // getters and setters
    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getFuel() {
        return fuel;
    }


}
