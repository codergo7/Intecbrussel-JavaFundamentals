package be.intecbrussel.ex_03;

public class PrinterAppLambda {

    public static void main(String[] args) {

        Thread t1 = new Thread(()-> print('1',100));
        Thread t2 = new Thread(()-> print('2',100));
        Thread t3 = new Thread(()-> print('3',100));
        Thread t4 = new Thread(()-> print('4',100));
        Thread t5 = new Thread(()-> print('5',100));
        Thread t6 = new Thread(()-> print('6',100));
        Thread t7 = new Thread(()-> print('7',100));
        Thread t8 = new Thread(()-> print('8',100));
        Thread t9 = new Thread(()-> print('9',100));
        Thread t10 = new Thread(()-> print('*',100));
        Thread t11 = new Thread(()-> print('$',100));
        Thread t12 = new Thread(()-> print('@',100));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
        t11.start();
        t12.start();
        System.out.println(Runtime.getRuntime().availableProcessors());

    }

    private static void print(char c, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(c + " ");
            Thread.yield();
        }
    }


}
