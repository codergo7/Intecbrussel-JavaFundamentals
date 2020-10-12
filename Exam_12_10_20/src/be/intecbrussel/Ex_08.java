package be.intecbrussel;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 for square, 2 for triangle, 3 for circle: ");
        int figure = scanner.nextInt();

        double field=0;
        final double PI = 3.14;

        if(figure==1){
            System.out.println("Enter a side of square please: ");
            int side = scanner.nextInt();
            field = side *side;
        }
        else if(figure==2){
            System.out.println("Enter the base of triangle please:");
            int base = scanner.nextInt();
            System.out.println("Enter the height of triangle please.");
            int height = scanner.nextInt();
            field = base *height/2;
        }
        else if(figure==3){
            System.out.println("Enter the radius of circle please.");
            int radius = scanner.nextInt();

            field = Math.pow(radius,2)*PI;
        }
        else System.out.println("You entered invalid ");

        System.out.println("The field is " + field);

        scanner.close();
    }
}
