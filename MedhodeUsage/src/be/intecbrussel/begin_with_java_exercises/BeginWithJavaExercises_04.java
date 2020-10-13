package be.intecbrussel.begin_with_java_exercises;

public class BeginWithJavaExercises_04 {

    public static void main(String[] args) {
        for(int i = 1; i<=500; i++){
            if(isPrime(i))
                System.out.println(i);
        }

    }
    public static boolean isPrime(int number){
        if(number == 1) return false;
        int i = 2;
        while(i<number){
            if(number%i == 0) return false;
            i++;
        }
        return true;
    }
}
