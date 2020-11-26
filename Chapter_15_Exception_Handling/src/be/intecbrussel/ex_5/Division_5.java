package be.intecbrussel.ex_5;

import java.util.Scanner;

public class Division_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        try {
            System.out.println("Enter first number: ");
            int num = Integer.parseInt(scanner.next());
            System.out.println("Enter second number: ");
            int den = Integer.parseInt(scanner.next());
            int div = divide(num,den);
            System.out.format("%d/%d=%d\n", num, den, div);
        } catch (Exception exception) {
            System.out.println("Invalid number");
            System.out.println(exception.getMessage());
            exception.printStackTrace();
            //main(new String[]{});
        }
        finally {
            scanner.close();
            System.out.println("Final");
        }
    }

    private static int divide(int num, int den) {

        return num / den;
    }
}
