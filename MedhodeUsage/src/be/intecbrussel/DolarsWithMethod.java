package be.intecbrussel;

import java.util.Scanner;

public class DolarsWithMethod {

    public static int money = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an amount please:  ");
        money = scanner.nextInt();

        int fiveHundred = 0, twoHundred = 0, hundred = 0, fifty = 0, twenty = 0, ten = 0, five = 0, two = 0, one = 0;

        fiveHundred = amount(500);
        twoHundred = amount(200);
        hundred = amount(100);
        fifty = amount(50);
        twenty = amount(20);
        ten = amount(10);
        five = amount(5);
        two = amount(2);
        one = amount(1);

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

    public static int amount( int amount){
        int result =0;
        while (money>=amount){
            money -=amount;
            result++;
        }
        return result;
    }
}
