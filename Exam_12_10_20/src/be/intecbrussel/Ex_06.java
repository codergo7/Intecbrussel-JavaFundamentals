package be.intecbrussel;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Initial capital: ");
        double capital = scanner.nextDouble();
        System.out.println("Interest Rate(%) : ");
        double percentageOfInterest = scanner.nextDouble();
        System.out.println("Time (year): ");
        int year = scanner.nextInt();

        //double compoundAmount =capital;

        for (int i = 1; i <= year; i++) {
            capital += capital * percentageOfInterest / 100;
            System.out.println( "End of " + i + ". year: " + capital + " Euros");
        }
        scanner.close();

    }
}
