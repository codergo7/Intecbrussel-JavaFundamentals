package be.intecbrussel.ex_10;

import java.util.TimerTask;

public class Timeout extends TimerTask {

    @Override
    public void run() {
        System.out.println("De tijd is verstreken");
    }
}
