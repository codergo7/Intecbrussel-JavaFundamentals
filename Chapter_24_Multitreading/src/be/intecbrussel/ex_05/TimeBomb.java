package be.intecbrussel.ex_05;

public class TimeBomb {

    private int count;
    private Thread thread;

    public TimeBomb(int count) {
        this.count = count;
    }

    public void activate(){
        this.thread = new Thread(()->ticking(this.count));
        this.thread.start();
    }

    private void ticking(int count) {
        while (count>=0) {
            System.out.println("Timebomb ticking: " + count-- + " seconds left");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Disarmed!");
                return;
            }
        }
        System.out.println("Booooom!!!");
    }

    public void disarm() {
        this.thread.interrupt();
    }
}
