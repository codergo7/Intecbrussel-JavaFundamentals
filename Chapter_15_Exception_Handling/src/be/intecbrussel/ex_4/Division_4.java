package be.intecbrussel.ex_4;

import java.util.Scanner;

public class Division_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        try {
            System.out.println("Enter first number: ");
            int num = Integer.parseInt(scanner.next());
            System.out.println("Enter second number: ");
            int den = Integer.parseInt(scanner.next());
            scanner.close();
            int div = divide(num,den);
            System.out.format("%d/%d=%d", num, den, div);
        } catch (Throwable throwable) {
            System.out.println("Invalid number");
            //System.out.println(nfe.getMessage());
            //nfe.printStackTrace();

            //main(new String[]{});
        }
    }

    private static int divide(int num, int den) {

        return num / den;
    }
}
