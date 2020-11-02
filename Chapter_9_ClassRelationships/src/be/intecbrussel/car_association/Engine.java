package be.intecbrussel.car_association;

public class Engine {

    private int fuelCapacity;
    private int fuel;

    public Engine() {
    }

    public Engine(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }


    //this method takes fuel and updates fuel data
    public void reFuel(int fuel) {
        if(this.fuel+fuel > fuelCapacity){
            this.fuel = fuelCapacity;
        }
        else {
            this.fuel += fuel;
        }
    }

    // this method consumes the fuel and updates fuel data
    public void burnFuel(int fuel) {
        if(this.fuel -fuel >0){
            this.fuel -= fuel;
        }
    }

    // getters and setters
    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getFuel() {
        return fuel;
    }


}
