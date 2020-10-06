package be.intecbrussel.excercises;

public class Excercise17_08 {
    public static void main(String[] args) {
        for (int i=0; i<10000;i++){
            boolean isNumberDivideBy6 = i%6==0;
            boolean isNumberDivideBy28 = i%28==0;
            if(isNumberDivideBy6 && isNumberDivideBy28){
                System.out.println(i);
            }
        }
    }
}
