package be.intecbrussel;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gross salary: ");
        int grossSalary = scanner.nextInt();
        int netSalary;

        if(grossSalary>3000){
            netSalary = grossSalary - grossSalary*38/100;
        }
        else if(grossSalary>=200){
            netSalary = grossSalary - grossSalary*35/100;
        }
        else {
            netSalary = grossSalary - grossSalary*27/100;
        }
        System.out.println("Net salary: " + netSalary);

        scanner.close();
    }


}
