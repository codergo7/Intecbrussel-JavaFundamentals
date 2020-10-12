package be.intecbrussel;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voor het berekenen van de oppervlakte van een aantal meetkundige figuren. invoer 1 voor vierkant, 2 voor driehoek, 3 voor cirkel: ");
        int figure = scanner.nextInt();

        double area=0;
        final double PI = 3.14;

        if(figure==1){
            System.out.println("Invoer een zijde van vierkant AUB: ");
            int side = scanner.nextInt();
            area = side *side;
        }
        else if(figure==2){
            System.out.println("Invoer de basis van driehoek AUB.");
            int base = scanner.nextInt();
            System.out.println("Invoer de hoogte van driehoek AUB.");
            int height = scanner.nextInt();
            area = base *height/2;
        }
        else if(figure==3){
            System.out.println("Invoer de straal van cirkel AUB.");
            int radius = scanner.nextInt();

            area = Math.pow(radius,2)*PI;
        }
        else System.out.println("U heeft geen geldige nummer ingevoerd.");

        System.out.println("De oppervlakte is " + area);
    }
}
