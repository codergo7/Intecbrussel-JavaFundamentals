package be.intecbrussel.begin_with_java_exercises;

import java.util.Scanner;

public class BeginWithJavaExercises_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int firstNumber = scanner.nextInt();


    }

    public static boolean isEven(int number){
        if(number%2==0) return true;

        return false;
    }
}


