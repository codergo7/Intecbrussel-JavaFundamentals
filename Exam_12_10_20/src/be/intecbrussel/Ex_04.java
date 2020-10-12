package be.intecbrussel;

import java.util.Scanner;
import java.util.SortedMap;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number please:  ");
        int number = scanner.nextInt();
        int fiveHundred = 0, twoHundred = 0, hundred = 0, fifty = 0, twenty = 0, ten = 0, five = 0, two = 0, one = 0;

        while (number > 0) {

            if (number >= 500) {
                number -= 500;
                fiveHundred++;
            } else if (number >= 200) {
                number -= 200;
                twoHundred++;
            } else if (number >= 100) {
                number -= 100;
                hundred++;
            } else if (number >= 50) {
                number -= 50;
                fifty++;
            } else if (number > 20) {
                number -= 20;
                twenty++;
            } else if (number >= 10) {
                number -= 10;
                ten++;
            } else if (number >= 5) {
                number -= 5;
                five++;
            } else if (number >= 2) {
                number -= 2;
                two++;
            } else {
                number -= 1;
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
    }
}
