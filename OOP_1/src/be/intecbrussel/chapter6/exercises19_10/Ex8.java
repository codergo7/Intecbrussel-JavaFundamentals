package be.intecbrussel.chapter6.exercises19_10;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a text please ");
        String text = scanner.nextLine();
        upperCaseLast3(text);
    }
    public static void upperCaseLast3(String text){
        if(text.length()>=3){
            String str2 = text.substring(text.length()-3).toUpperCase();
            String str1 = text.substring(0,text.length()-3);
            System.out.println(str1+str2);
        }
        else {
            System.out.println("Length of text is smaller than 3");
        }
    }
}
