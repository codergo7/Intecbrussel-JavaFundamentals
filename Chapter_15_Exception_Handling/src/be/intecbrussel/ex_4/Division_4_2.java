package be.intecbrussel.ex_4;

import java.util.Scanner;

public class Division_4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");

        try {
            int num = Integer.parseInt(scanner.next());
            System.out.println("Enter second number: ");
            int den = Integer.parseInt(scanner.next());
            scanner.close();
            int div = divide(num,den);
            System.out.format("%d/%d=%d", num, den, div);
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid number format.");
            System.out.println(nfe.getMessage());
            nfe.printStackTrace();
            //main(new String[]{});
        }
       catch (IllegalArgumentException iae) {
            System.out.println("Illegal argument.");
        }
        catch (ArithmeticException a) {
            System.out.println("Division by zero. ");
            //main(new String[]{});
        }
        catch (RuntimeException re) {
            System.out.println("Invalid number _ Runtime");
          //main(new String[]{});
        }
        catch (Exception exception) {
            System.out.println("Invalid number _ Exception");
            //main(new String[]{});
        }
        catch (Throwable throwable) {
            System.out.println("Invalid number _ Exception");
            //main(new String[]{});
        }
    }

    private static int divide(int num, int den) throws ArithmeticException, NumberFormatException{

        return num / den;
    }
}
