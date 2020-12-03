package be.intecbrussel.ex_1;

public class DuoApp {

    public static void main(String[] args) {

        Duo<Double> doubleDuo = new Duo<Double>(5.0,9.0);

        Duo<String> stringDuo = new Duo<String>("What is"," the Generics");

        Double d1 = doubleDuo.getFirst();
        Double d2 = doubleDuo.getSecond();

        String s1 = stringDuo.getFirst();
        String s2 = stringDuo.getSecond();

        System.out.println( s1 + " " + s2);

        System.out.println( d1 + d2);

    }
}
