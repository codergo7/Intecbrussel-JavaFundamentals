package be.intecbrussel.begin_with_java_exercises;

import java.util.Scanner;

public class BeginWithJavaExercises_05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");

        String number = String.valueOf(scanner.nextInt());
        System.out.println(isPalindrome(number));

    }
    public static boolean isPalindrome (String number) {
        for(int i = 0, k = number.length()-1;i<k; i++,k--){
            if(number.charAt(i) != number.charAt(k)) return false;
        }
        return true;
    }
}
