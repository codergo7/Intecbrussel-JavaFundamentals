package be.intecbrussel;

import java.util.Scanner;

public class Dolars2 {

    public static void main(String[] args) {


        int result =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an amount please:  ");
        int amount = scanner.nextInt();

        int[] noteValues = {500, 200, 100, 50, 20, 10, 5, 2, 1};

        for (int value : noteValues) {
            //result += amountOutput(amount, value) +
        }
    }

    public static int amountOfMoney(int totalAmount, int valueOfCoin) {
        int result = 0;
        while (totalAmount >= valueOfCoin) {
            totalAmount -= valueOfCoin;
            result++;
        }
        return result;

    }

    public static int remainingMoney(int totalAmount, int valueOfCoin, int amountOfPieces) {
        return totalAmount - valueOfCoin * amountOfPieces;
    }

    public static void amountOutput(int totalAmount, int valueOfCoin) {

    }
}
