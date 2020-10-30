package intecbrussel.car_assignment;

import java.util.Random;

public class RandomCarApp {

    public static void main(String[] args) {

        Car[] cars = new Car[20];

        for (int i = 0; i < cars.length ; i++) {
            cars[i] = randomGenerator();
        }

        for (Car car : cars){
            car.print();
        }

        for(Car car: cars){
            car.park();
        }

        for (Car car : cars){
            car.print();
        }
    }

    public static Car randomGenerator() {

        String[] colors = {"white","red","blue","green", "grey","purple","orange"};

        Random random = new Random();

        return new Car(randomHp(), randomSpeed(), randomColor(), randomLight() );
    }

    public static String randomColor() {

        String[] colors = {"white","red","blue","green", "grey","purple","orange"};

        Random random = new Random();

        return colors[random.nextInt(colors.length)];
    }
    public static double randomSpeed() {
        Random random = new Random();
        int limit = 100;
        return random.nextInt(limit) +1;
    }
    public static int randomHp() {
        Random random = new Random();
        int limit = 100;
        return random.nextInt(limit) +1;
    }
    public static  boolean randomLight() {
        Random random = new Random();
        boolean[] light = {true,false};
        return light[random.nextInt(2)];
    }


}
