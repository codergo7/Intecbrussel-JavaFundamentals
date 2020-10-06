package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);


        System.out.println("Enter a number for a: ");
        var a = keyboard.nextInt();

        System.out.println("Enter a number for b: ");
        var b = keyboard.nextInt();

        var word = keyboard.next();

        var sum = a + b;
        System.out.println("Total= " + word + " :" + sum);
        keyboard.close();
    }
}
