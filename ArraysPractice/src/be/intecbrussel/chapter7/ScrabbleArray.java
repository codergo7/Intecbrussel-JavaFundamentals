package be.intecbrussel.chapter7;

import java.util.Scanner;

public class ScrabbleArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = scanner.nextLine();

        char[] letters = word.toUpperCase().toCharArray();

        System.out.println("Your point: " + pointCalculator( letters));

    }
    public static int pointCalculator(char[] letters){
        //from A to Z letters points of scrabble
        int[] scrabbleLetters={1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};

        int sumOfPoints =0;
        for(char letter: letters){
            sumOfPoints+=scrabbleLetters[letter-'A'];
        }
        return sumOfPoints;
    }
}
