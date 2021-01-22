package be.intecbrussel.ex_6;

public class PrinterAppLambda {

    public static void main(String[] args) {

        Thread t1 = new Thread(()-> print('1',50));
        Thread t2 = new Thread(()-> print('2',50));

        t1.start();
        t2.start();

        try {
            //  main thread waits that t1 an t2 terminate
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());
        System.out.println("End");
    }

    private static void print(char c, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(c + " ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
