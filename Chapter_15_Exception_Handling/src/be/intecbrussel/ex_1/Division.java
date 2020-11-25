package be.intecbrussel.ex_1;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num =0;
        int den = 0;
        int div =0;

        try {
            System.out.println("Enter first number: ");
            num = Integer.parseInt(scanner.next());
            System.out.println("Enter second number: ");
            den = Integer.parseInt(scanner.next());
            div = num / den;

            System.out.format("%d/%d=%d", num, den, div);
        }catch (NumberFormatException e){
            System.out.println("Please enter numbers");
            main(new String[]{});

        } catch (ArithmeticException a){
            System.out.println("Dividing value can not be zero.");
            main(new String[]{});

        }


        scanner.close();
    }
}
