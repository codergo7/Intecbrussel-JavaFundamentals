package be.intecbrussel.ex_car;

import java.util.Arrays;
import java.util.Random;

public class CarApp {

    public static void main(String[] args) {


        Car pegout = new Car("pegout", new Color("Yellow"), new Person("Manuel", 28));
        pegout.getEngine().setFuelCapacity(40);

        System.out.println(pegout.toString());

        Car ferrari = new Car("ferrari", new Color("Red"), new Person("Jean-Marie-Robert-Roger",35));
        ferrari.getEngine().setFuelCapacity(60);

        System.out.println(ferrari.toString());

        // change the color and calculate the cost
        System.out.println(pegout.rePaint(new Color("White")) + " Euro");

        // 4 - PassengerArray

        Car rodePegout = new Car("pegout", new Color("Red"));
        rodePegout.setSeats(new Person[3]);
        //rodePegout.setSeats(new Person[]{new Person("Leonardo",20),new Person("Raphael",21),
          //      new Person("Michelangelo ",22), new Person("Leonardo",23)});

        Car passat = new Car("Passat", new Color("Yellow"));
        passat.setSeats(new Person[10]);


    }


}
