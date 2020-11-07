package be.intecbrussel.car_inheritence;

public class CarApp {
    public static void main(String[] args) {
        Car suv = new Suv("red",100,250,true);
        Car cabrio = new Cabrio("yellow", 100,200,true);
        Car electric = new ElectricCar("green",100,100,60);

        suv.accelerate(50);
        cabrio.accelerate(50);
        electric.accelerate(50);

        Car[] cars = new Car[3];
        cars[0] = suv;
        cars[1] = cabrio;
        cars[2] = electric;

        for(Car car: cars){
            System.out.println(car);
            car.park();
            System.out.println(car);
            System.out.println();
        }



    }
}
