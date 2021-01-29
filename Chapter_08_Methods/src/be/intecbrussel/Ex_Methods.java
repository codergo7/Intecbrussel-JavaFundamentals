package be.intecbrussel;

import java.util.Scanner;

public class Ex_Methods {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 0 for sum, 1 for subtract, 2 for multiply, 3 for divide or 4 for remainder");
        int operator = scanner.nextInt();
        System.out.println("Enter first number");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number");
        int number2 = scanner.nextInt();
        scanner.close();
        int result=0;

        //Alternative1
        /*int[] operators = {sum(number1, number2), subtract(number1, number2), multiply(number1, number2), divide(number1, number2), remainder(number1, number2)};
        result = operators[operator];
        System.out.println(operators[operator]);*/



        //Alternative2
        switch (operator) {
            case 0:
                result = sum(number1, number2);
                break;
            case 1:
                result = subtract(number1, number2);
                break;
            case 2:
                result = multiply(number1, number2);
                break;
            case 3:
                result = divide(number1, number2);
                break;
            case 4:
                result = remainder(number1, number2);
        }

        //Alternative3
       /* if(operator==0) result = sum(number1, number2);
        else if (operator==1) result = subtract(number1, number2);
        else if (operator==2) result =  multiply(number1, number2);
        else if (operator==3) result = divide(number1, number2);
        else result = remainder(number1, number2);

        */
        System.out.println(result);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int remainder(int a, int b) {
        return a % b;
    }

}
