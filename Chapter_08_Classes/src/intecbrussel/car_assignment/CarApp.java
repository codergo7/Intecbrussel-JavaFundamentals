package intecbrussel.car_assignment;

public class CarApp {

    public static void main(String[] args) {
        Car car1 = new Car("purple");
        Car car2 = new Car(70,true);
        Car car3 = new Car(200);

        car1.rePaint("red");
        car2.speed(30);

        Car car4 = new Car("red");
        Car car5 = new Car(250);
        Car car6 = new Car(5.0);

        car4.print();

        System.out.println(Car.amountOfCar);


    }
}
