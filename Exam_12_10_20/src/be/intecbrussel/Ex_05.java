package be.intecbrussel;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Leeftijd: ");
        int age = scanner.nextInt();
        System.out.println("Aantal kinderen: ");
        int amountChildren = scanner.nextInt();
        System.out.println("Jaarinkomen: ");
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

        System.out.println("Uw lidgeld is " + (fee > 2.5 ? fee : 2.5) + " Euros");
    }
}
