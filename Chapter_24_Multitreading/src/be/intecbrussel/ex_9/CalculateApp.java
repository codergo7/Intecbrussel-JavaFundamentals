package be.intecbrussel.ex_9;

import java.util.Random;

public class CalculateApp {

     static int count=0;

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Thread thread1 = new Thread(()-> calculate(calculator,100));
        Thread thread2 = new Thread(()-> calculate(calculator,100));
        Thread thread3 = new Thread(()-> calculate(calculator,100));

        thread1.start();
        thread2.start();
        thread3.start();
    }

    private static void calculate(Calculator calculator, int number) {

        Random random = new Random();

        for (int i = 0; i < number; i++) {
            int value = random.nextInt(10);
            calculator.setValue(value);
            Thread.currentThread().setName("T_1");
            int result = calculator.getResult();

            System.out.println(value + " : " + result);
            System.out.println(++count);
            if(result != (value*value))
                System.out.println("Error");
        }
    }
}
