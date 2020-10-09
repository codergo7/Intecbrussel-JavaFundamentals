package be.intecbrussel.forloop_exercises;

public class Exercise17_07 {
    public static void main(String[] args) {
        for (int i=0; i<10000;i++){
            boolean isDividableBy6 = i%6==0;
            boolean isDividableBy28 = i%28==0;
            if(isDividableBy6 && isDividableBy28){
                System.out.println(i);
            }
        }


    }
}



