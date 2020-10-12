package be.intecbrussel;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Point of Math (1-10): ");
        int pointOfMath = scanner.nextInt();
        System.out.println("Point of Accounting (1-10): ");
        int pointOfAccounting = scanner.nextInt();
        System.out.println("Point of Computer Science (1-10): ");
        int pointOfComputerScience = scanner.nextInt();

        String note = "You are successful";

        if(pointOfMath<6){
        note = "You are not successful. Because point of math is less than 6.";
        }
        if((pointOfAccounting + pointOfComputerScience)<12){
            note = "You are not successful. Because total point of Computer Science and Accounting are less than 12" + (pointOfMath<6? "and point of math is less than 6.":"");
        }

        System.out.println(note);

    }
}
