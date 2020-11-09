package be.intecbrussel.car_inheritence;

public class CarApp {
    public static void main(String[] args) {
        Suv suv = new Suv("red",250);
        Cabrio cabrio = new Cabrio("yellow", 200);
        ElectricCar electric = new ElectricCar("green",200,100);

        suv.accelerate(150);
        cabrio.accelerate(150);
        electric.accelerate(150);
        electric.slow(100);

        suv.driving4x4(true);
        suv.accelerate(100);

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
