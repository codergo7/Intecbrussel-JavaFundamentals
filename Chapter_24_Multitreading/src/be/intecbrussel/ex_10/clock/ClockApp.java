package be.intecbrussel.ex_10.clock;

import java.util.Timer;

public class ClockApp {

    public static void main(String[] args) {

        Clock clock = new Clock();

        Timer timer = new Timer(true);
        timer.schedule(clock,1000);

        System.out.println("What time is it?");

        try {
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
