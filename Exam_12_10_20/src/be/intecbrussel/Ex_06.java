package be.intecbrussel;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Begin kapitaal: ");
        double capital = scanner.nextDouble();
        System.out.println("Interest Percentage : ");
        double percentageOfInterest = scanner.nextDouble();
        System.out.println("Looptijd: ");
        int year = scanner.nextInt();

        //double compoundAmount =capital;

        for(int i = 1; i<=year;i++ ){
            capital += capital*percentageOfInterest/100;
            System.out.println("Uw samengesteld bedrag van " + i + ". jaar: " + capital);

        }


    }
}
