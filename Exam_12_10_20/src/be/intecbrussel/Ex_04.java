package be.intecbrussel;

import java.util.Scanner;
import java.util.SortedMap;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an amount please:  ");
        int amount = scanner.nextInt();
        int fiveHundred = 0, twoHundred = 0, hundred = 0, fifty = 0, twenty = 0, ten = 0, five = 0, two = 0, one = 0;

        while (amount > 0) {

            if (amount >= 500) {
                amount -= 500;
                fiveHundred++;
            } else if (amount >= 200) {
                amount -= 200;
                twoHundred++;
            } else if (amount >= 100) {
                amount -= 100;
                hundred++;
            } else if (amount >= 50) {
                amount -= 50;
                fifty++;
            } else if (amount > 20) {
                amount -= 20;
                twenty++;
            } else if (amount >= 10) {
                amount -= 10;
                ten++;
            } else if (amount >= 5) {
                amount -= 5;
                five++;
            } else if (amount >= 2) {
                amount -= 2;
                two++;
            } else {
                amount -= 1;
                one++;
            }

        }
        System.out.println("You need " + (fiveHundred > 0 ? fiveHundred + " pieces of 500$ \n" : "")
                + (twoHundred > 0 ? twoHundred + " pieces of 200$ \n" : "")
                + (hundred > 0 ? hundred + " pieces of 100$ \n" : "")
                + (fifty > 0 ? fifty + " pieces of 50$ \n" : "")
                + (twenty > 0 ? twenty + " pieces of 20$ \n" : "")
                + (ten > 0 ? ten + " pieces of 10$ \n" : "")
                + (five > 0 ? five + " pieces of 5$ \n" : "")
                + (two > 0 ? two + " pieces of 2$ \n" : "")
                + (one > 0 ? one + " pieces of 1$" : ""));

        scanner.close();
    }
}
