package be.intecbrussel.chapter6.exercises19_10;

import java.util.Random;
import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int step =0;

        int rand = random.nextInt(10);
        //System.out.println(rand);
        System.out.println("Guess a number between 1 and 10 please");
        int guess = scanner.nextInt();
        while (rand != guess){
            System.out.println("Wrong guess!");
            System.out.println("Guess again: ");
            guess = scanner.nextInt(10);
            step++;
        }
        System.out.println("Congratulations you guess ture " + step + " steps");

    }
}
