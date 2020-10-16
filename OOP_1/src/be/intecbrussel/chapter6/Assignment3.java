package be.intecbrussel.chapter6;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Eneter a text please: ");
        String text = scanner.nextLine();
        System.out.println("Length: " + lengthText(text));

        String text2 = uppercaseOfText(text);
        System.out.println("upper case " + text2);

        System.out.println("Lowercase: " + lowercaseOfText(text2));

        System.out.println("replace: " + replaceLetters(text, 'h', 'm'));

        System.out.println("Counter: " + countOfLetter(text, 'l'));


        System.out.println("Enter a different text: ");
        String text3 = scanner.nextLine();

        System.out.println("Is equals: " + isEquals(text, text3));

        compareAndPrint(text,text3);

        String text4 = "                          test       ";
        withoutSpacePrint(text4);
    }

    public static int lengthText(String text){
        return text.length();
    }
    public static String uppercaseOfText(String text){
        return text.toUpperCase();
    }
    public static String lowercaseOfText(String text){
        return text.toLowerCase();
    }
    public static String replaceLetters(String text, char letter1, char letter2){
        return text.replace(letter1,letter2);
    }
    public static int countOfLetter(String text, char letter){
        int count =0;
        for (int i=0; i<text.length()-1;i++){
            if(text.charAt(i)==letter) count++;
        }

        return count;
    }
    public static boolean isEquals(String text1, String text2) {
        return text1.equals(text2);
    }
    public static void compareAndPrint(String text1, String text2) {
        if(text1.compareTo(text2)==1){
            System.out.println("compare and print: " + text1);
        }
        else{
            System.out.println("compare and print: " + text2);
        }
    }
    public static void withoutSpacePrint(String text1) {
        System.out.println( "Print without space: " + text1.trim());
    }




}
