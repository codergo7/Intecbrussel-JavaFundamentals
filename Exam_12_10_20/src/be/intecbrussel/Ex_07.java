package be.intecbrussel;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Punt van Wiskunde (1-10): ");
        int pointOfMath = scanner.nextInt();
        System.out.println("Punt van Boekhouden (1-10): ");
        int pointOfAccounting = scanner.nextInt();
        System.out.println("Punt van Informatica (1-10): ");
        int pointOfComputerScience = scanner.nextInt();

        String note = "Proficiaat. U bent geslaagd";

        if(pointOfMath<6){
        note = "U bent niet geslaagd. Omdat punt van wiskunde minder dan 6 is.";
        }
        if((pointOfAccounting + pointOfComputerScience)<12){
            note = "U bent niet geslaagd. Omdat total punten van Informatica en Boekhouden minder dan 12" + (pointOfMath<6? "en punt van wiskunde minder dan 6":"") + " zijn.";
        }

        System.out.println(note);

    }
}
