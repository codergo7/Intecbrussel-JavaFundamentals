package be.intecbrussel.ex_1;

public class MixedDuoApp {

    public static void main(String[] args) {

        MixedDuo<String,Integer> mixedDuo = new MixedDuo<String,Integer>("Hello",5);

        String str = mixedDuo.getFirst();
        Integer integer = mixedDuo.getSecond();

        System.out.println(str + " " + integer);
    }
}
