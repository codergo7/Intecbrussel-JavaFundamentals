package be.intecbrussel.ex_5;

import be.intecbrussel.ex_1.Duo;

public class DuoUtility {

    public static void printUpper(Duo<String> d){
        System.out.println(d.getFirst().toUpperCase() + "," + d.getSecond().toUpperCase());
    }

    public static void printDuo(Duo<?> d){
        System.out.println(d.getFirst() + "," + d.getSecond());
    }

    public static void printSum(Duo<? extends Number> d){
        Number number1 = d.getFirst();
        Number number2 = d.getSecond();

        System.out.println(number1 + "+" + number2 + "=" + (number1.doubleValue() + number2.doubleValue()));
    }
}
