package be.intecbrussel;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Brutoloon?: ");
        int brutoloon = scanner.nextInt();
        int nettoloon;

        if(brutoloon>3000){
            nettoloon = brutoloon - brutoloon*38/100;
        }
        else if(brutoloon>=200){
            nettoloon = brutoloon - brutoloon*35/100;
        }
        else {
            nettoloon = brutoloon - brutoloon*27/100;
        }
        System.out.println("Nettoloon: " + nettoloon);
    }


}
