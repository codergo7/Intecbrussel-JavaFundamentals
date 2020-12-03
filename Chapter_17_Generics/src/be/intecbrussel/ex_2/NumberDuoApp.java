package be.intecbrussel.ex_2;

public class NumberDuoApp {

    public static void main(String[] args) {

        NumberDuo<Integer> numberDuo = new NumberDuo<Integer>(5,7);

        System.out.println(numberDuo.getSum());
    }


}
