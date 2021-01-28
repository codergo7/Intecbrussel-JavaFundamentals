package be.intecbrussel.ex_8;

public class Counter {

    private int count;
    private Object object = new Object();

    public synchronized void increment(){

            count++;

    }

    public void decrement(){
        synchronized (object){
            count--;
        }
    }

    public int getCount() {
        return count;
    }
}
