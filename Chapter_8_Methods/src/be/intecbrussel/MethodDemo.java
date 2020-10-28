package be.intecbrussel;

public class MethodDemo {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int sum = sum(a, b);
    }

    private static int sum(int number1, int number2) {
        short num3 = 3;
        byte num4 = 5;
        long num5 = 1222;
        char ch = 'a';
        String [] str = new String[2];
        main(str);

        return number1 > number2 ? number1 + number2 : number1 - num3 + num4 + ch + (int) num5;
    }
}
