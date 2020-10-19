package be.intecbrussel;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Age: ");
        int age = scanner.nextInt();
        System.out.println("Amount of children: ");
        int amountChildren = scanner.nextInt();
        System.out.println("Annual income: ");
        int annualIncome= scanner.nextInt();

        double fee = 10;

        if(age>50){
            fee -=2;
        }
        if(amountChildren<=5){
            fee-=amountChildren;
        }
        else fee -=5;

        if(annualIncome<12500){
            fee -= 2.5;
        }

        System.out.println("Your membership fee: " + (fee > 1.5 ? fee : 1.5) + " Euros");

        scanner.close();
    }
}
