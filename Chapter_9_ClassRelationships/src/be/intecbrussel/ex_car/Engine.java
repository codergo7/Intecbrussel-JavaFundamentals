package be.intecbrussel.ex_car;

import java.awt.Color;

public class Engine {

    private int fuelCapacity;
    private int fuel;
    //private int tripKm;


    public Engine() {
    }

    public Engine(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getFuel() {
        return fuel;
    }

    public void reFuel(int fuel) {
        if(this.fuel+fuel > fuelCapacity){
            this.fuel = fuelCapacity;
        }
        else {
            this.fuel += fuel;
        }
    }

    public void burnFuel(int fuel) {
        if(this.fuel -fuel >0){
            this.fuel -= fuel;
        }
    }
}
