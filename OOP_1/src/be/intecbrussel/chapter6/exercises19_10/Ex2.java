package be.intecbrussel.chapter6.exercises19_10;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a text please ");
        String text = scanner.nextLine();

        int counter =0;
        for (int i = 0; i <text.length() ; i++) {
            if(isVowel(text.charAt(i))){
                counter++;
            }
        }
        System.out.println("The text has " + counter + (counter > 1 ? " vowels." : " vowel."));

    }
    public static boolean isVowel(char letter){
        switch (letter){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }
}
