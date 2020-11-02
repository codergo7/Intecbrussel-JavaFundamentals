package be.intecbrussel.car_association;

import java.util.Arrays;
import java.util.Collections;

public class CarApp {

    public static void main(String[] args) {


        Car pegout = new Car("pegout", new Color("Yellow"), new Person("Manuel", 28));
        pegout.getEngine().setFuelCapacity(40);

        //System.out.println(pegout.toString());

        Car ferrari = new Car("ferrari", new Color("Red"), new Person("Jean-Marie-Robert-Roger",35));
        ferrari.getEngine().setFuelCapacity(60);

        //System.out.println(ferrari.toString());

        // change the color and calculate the cost
        //System.out.println(pegout.rePaint(new Color("White")) + " Euro");

        // 4 - PassengerArray

        Car passat = new Car("Passat", new Color("Yellow"));
        passat.setSeats(new Person[10]);

        Car rodePegout = new Car("pegout", new Color("Red"));
        rodePegout.setSeats(new Person[4]);

        rodePegout.add(new Person("Leonardo",22));
        rodePegout.add(new Person("Raphael",21));
        rodePegout.add(new Person("Michelangelo",24));
        rodePegout.add(new Person("Donatello",23));

        // gets passengers of the Car instance
        Person[] passengers =rodePegout.getSeats();

        // sorts Persons by age
        Collections.sort(Arrays.asList(passengers), new ComparatorByAge());

        for(Person person : passengers){
            System.out.println(person);
        }


    }


}
