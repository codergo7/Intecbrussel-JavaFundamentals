package be.intecbrussel;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number please. ");
        int number = scanner.nextInt();

        do {
            System.out.print(number + " ");
            if(number%2==0) number/=2;
            else {
                number *= 3;
                number+=1;
            }

        }
        while (number!=1);

        System.out.println(number);

    }
}
