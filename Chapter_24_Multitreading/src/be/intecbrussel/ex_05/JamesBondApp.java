package be.intecbrussel.ex_05;

import java.util.Random;

public class JamesBondApp {

    public static void main(String[] args) {
        Random random = new Random();
        TimeBomb bomb = new TimeBomb(10);
        bomb.activate();
        try {
            Thread.sleep(random.nextInt(30000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        bomb.disarm();
    }
}
