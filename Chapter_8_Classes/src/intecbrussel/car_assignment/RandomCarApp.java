package intecbrussel.car_assignment;

import java.util.Random;

public class RandomCarApp {

    public static void main(String[] args) {

        Car[] cars = new Car[20];
        System.out.println("\n************ Generate new cars  ************");
        for (int i = 0; i < cars.length; i++) {
            cars[i] = randomGenerator();
        }

        for (Car car : cars) {
            car.print();
        }

        System.out.println("\n************ Park the cars  ************");

        for (Car car : cars) {
            car.park();
            car.print();
        }

    }

    public static Car randomGenerator() {
        Random random = new Random();

        return new Car(randomHp(random), randomSpeed(random), randomColor(random), randomLight(random));
    }

    public static String randomColor(Random random) {
        String[] colors = {"white", "red", "blue", "green", "grey", "purple", "orange", "black", "yellow"};

        return colors[random.nextInt(colors.length)];
    }

    public static double randomSpeed(Random random) {
        int limit = 100;
        return random.nextInt(limit) + 1;
    }

    public static int randomHp(Random random) {
        int limit = 100;
        return random.nextInt(limit) + 1;
    }

    public static boolean randomLight(Random random) {
        boolean[] light = {true, false};
        return light[random.nextInt(2)];
    }


}
