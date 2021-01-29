package be.intecbrussel.chapter6.exercises19_10;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a text please ");
        String text = scanner.nextLine();

        System.out.println("There are " + amountOfSpace2(text) + " spaces");
    }
    public static int amountOfSpace(String text){
        int counter =0;
        for (int i = 0; i <text.length() ; i++) {
            if(text.charAt(i)== ' '){
                counter++;
            }
        }
        return counter;
    }
    public static int amountOfSpace2(String text){
        int counter =0;
        String str =text.replace(" ","");
        return text.length()-str.length();
    }
}
