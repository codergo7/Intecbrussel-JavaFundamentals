package be.intecbrussel.chapter6.examen19_10;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String answer;
        do {
            System.out.println("Enter first number: ");
            int number1 = scanner.nextInt();

            System.out.println("Enter second number: ");
            int number2 = scanner.nextInt();

            System.out.println("Sum of numbers: " + sumNumbers(number1, number2));

            System.out.println("Do you want to sum new numbers? Enter 'y' for yes or 'n' for no ");
            answer = scanner.next();
        } while (answer.charAt(0)!='n');

    }

    private static int sumNumbers(int number1, int number2) {

        return number1 + number2;
    }
}
