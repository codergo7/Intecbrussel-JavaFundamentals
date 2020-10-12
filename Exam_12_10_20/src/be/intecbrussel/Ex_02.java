package be.intecbrussel;

public class Ex_02 {
    public static void main(String[] args) {
        int number =1;
        do{
            if(number%2==1){
                System.out.println(number);
            }
            number++;
        }
        while (number<=99);
    }
}
