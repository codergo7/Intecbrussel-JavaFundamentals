package be.intecbrussel.begin_with_java_exercises;

import java.util.Scanner;

public class BeginWithJavaExercises_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println(sum(firstNumber, secondNumber));
    }

    public static int sum(int num1, int num2){
        return num1 + num2;
    }
}
