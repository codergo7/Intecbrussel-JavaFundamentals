package be.intecbrussel.ex_2;

import java.io.Serializable;

public class NumberDuoApp {

    public static void main(String[] args) {

        NumberDuo<Integer> numberDuo = new NumberDuo<Integer>(5,7);
        System.out.println(numberDuo.getSum());

        NumberDuo<?> numberDuo2 = new NumberDuo<Integer>(5,7);

        //Integer i = numberDuo2.getFirst(); // can not be compiled

        Number number = numberDuo2.getFirst();

        System.out.println(number);


    }


}
