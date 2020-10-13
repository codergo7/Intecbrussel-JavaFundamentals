package be.intecbrussel.begin_with_java_exercises;

import java.util.Scanner;

public class BeginWithJavaExercises_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        System.out.println(isVowel(scanner.next()));
    }

    public static boolean isVowel(String c) {
        boolean flag = false;
        switch (c) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                flag = true;
        }
        return flag;
    }
}
