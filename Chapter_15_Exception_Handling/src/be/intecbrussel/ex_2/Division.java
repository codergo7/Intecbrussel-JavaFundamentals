package be.intecbrussel.ex_2;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter first number: ");
            int num = Integer.parseInt(scanner.next());
            System.out.println("Enter second number: ");
            int den = Integer.parseInt(scanner.next());
            int div = num / den;

            System.out.format("%d/%d=%d", num, den, div);
            scanner.close();
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid number");
            System.out.println(nfe.getMessage());
            nfe.printStackTrace();

            //main(new String[]{});
        }
    }
}
