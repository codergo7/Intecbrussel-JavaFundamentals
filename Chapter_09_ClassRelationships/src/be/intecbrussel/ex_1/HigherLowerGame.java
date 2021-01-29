package be.intecbrussel.ex_1;

import java.util.Random;

public class HigherLowerGame {

    private int value;
    private int max;
    private Random random;

    public HigherLowerGame(int max) {
        this.max = max;
        this.random = new Random();

    }

    public void reset(){
        value = random.nextInt(max +1);
    }
}
