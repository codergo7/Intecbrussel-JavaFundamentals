package be.intecbrussel.ex_5;

public class PrinterAppLambda {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(()-> print('1',100));
        Thread t2 = new Thread(()-> print('2',1000));

        t1.setName("T1");
        t2.setName("T2");

        System.out.print(Thread.currentThread().getName()+ " ");
        Thread.sleep(1000);

        t1.start();
        t2.start();
        System.out.print(Thread.currentThread().getName()+ " ");
        //Thread.sleep(100000);
        Thread.sleep(1000);

        t1.interrupt();
        Thread.sleep(1300);
        t2.interrupt();
    }

    private static void print(char c, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(c + " ");
            System.out.print(Thread.currentThread().getName()+ " ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(Thread.currentThread().getName() + ": Interrupted.");
            }
        }
    }


}
