package be.intecbrussel.ex_1;

public class PrintApp {

    public static void main(String[] args) {
        PrintThread pt = new PrintThread('$',100);
        PrintThread pt2 = new PrintThread('*',100);
        System.out.println("PT2: "+ pt2.getState());
        pt.start();
        System.out.println("\nPT1: " + pt.getState());
        pt2.start();
        System.out.println("PT2: "+ pt2.getState());

    }
}
