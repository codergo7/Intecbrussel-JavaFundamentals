package be.intecbrussel.chapter6.exercises19_10;

public class Ex1 {

    public static void main(String[] args) {

        for (int i=1; i<=100;i++){

            if(isDivideBy3(i) && isDivideBy5(i)){
                System.out.println(i + " can be divided by 3 and 5");
            }

            else if(isDivideBy3(i)){
                System.out.println(i + " can be divided by 3");
            }
            else if(isDivideBy5(i)){
                System.out.println(i + " can be divided by 5");
            }
        }
    }
    public static boolean isDivideBy3(int number) {

        return number%3==0;
    }
    public static boolean isDivideBy5(int number) {

        return number%5==0;
    }

}
