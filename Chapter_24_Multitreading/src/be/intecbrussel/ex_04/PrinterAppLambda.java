package be.intecbrussel.ex_04;

public class PrinterAppLambda {

    public static void main(String[] args) {

        Thread t1 = new Thread(()-> print('1',10));
        Thread t2 = new Thread(()-> print('2',1000));

        t2.setDaemon(true);
        t1.setDaemon(true);
        t1.start();
        t2.start();

    }

    private static void print(char c, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(c + " ");
            Thread.yield();
        }
    }


}
