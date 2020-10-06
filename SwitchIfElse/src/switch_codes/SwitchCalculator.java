package switch_codes;

import java.util.Scanner;


public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number");
        int num2 = scanner.nextInt();
        System.out.println("Enter sort of operation; add, subtract, multiply, divide or (*), (-), (*), (/)  :");
        String operation = scanner.next().toLowerCase();

       int result = signCalculator(num1, num2, operation);

        System.out.println(result);
    }
    public static int signCalculator(int num1, int num2, String operation){
        int result=0;
        switch (operation){
            case "add":
            case "+":
                result= num1 + num2;
                break;
            case "subtract":
            case "-":
                result= num1 - num2;
                break;
            case "multiply":
            case "*":
                result= num1 * num2;
                break;
            case "divide":
            case "/":
                result= num1 / num2;
                break;
        }
        return result;
    }

}
