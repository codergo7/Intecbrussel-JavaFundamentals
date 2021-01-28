package be.intecbrussel.ex_10;

import java.util.Timer;

public class TimeoutApp {

    public static void main(String[] args) {

        Timeout task = new Timeout();

        Timer timer = new Timer(true);
        timer.schedule(task,1000*10);

        System.out.println("Please be patient");

        try {
            Thread.sleep(20*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
