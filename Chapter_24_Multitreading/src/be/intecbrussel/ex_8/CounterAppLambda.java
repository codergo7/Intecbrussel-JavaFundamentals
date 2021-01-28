package be.intecbrussel.ex_8;

public class CounterAppLambda {

    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread t1 = new Thread(()-> increment(counter,10000));
        Thread t2 = new Thread(()-> increment(counter,10000));

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println(counter.getCount());

    }

    private static void  increment(Counter counter, int count) {

        for (int j = 0; j <count ; j++) {
            counter.increment();
        }
    }
}
