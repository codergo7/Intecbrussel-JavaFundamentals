package be.intecbrussel.ex_11;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {

    private AtomicInteger count = new AtomicInteger(0);

    public void increment(){
            count.incrementAndGet();
    }

    public void decrement(){
            count.decrementAndGet();
    }

    public int getCount() {
        return count.get();
    }
}
