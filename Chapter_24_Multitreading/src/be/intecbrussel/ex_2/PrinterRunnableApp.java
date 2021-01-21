package be.intecbrussel.ex_2;

public class PrinterRunnableApp {

    public static void main(String[] args) {
        CharacterPrinter cp1 = new CharacterPrinter('*',30);
        CharacterPrinter cp2 = new CharacterPrinter('#',30);

        Thread t1 = new Thread(cp1);
        Thread t2 = new Thread(cp2);
        Thread t3 = new Thread(()-> print('@',30));

        t1.start();
        t2.start();
        t3.start();
    }

    private static void print(char c, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(c + " ");
        }
    }


}
