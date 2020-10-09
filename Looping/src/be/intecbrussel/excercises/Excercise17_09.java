package be.intecbrussel.excercises;

public class Excercise17_09 {
    public static void main(String[] args) {
        //long start1 = System.currentTimeMillis();
        long start1 = System.nanoTime();
        printPrimeNumbers();
        long finih1 = System.nanoTime();;

        long start2 = System.nanoTime();;
        printPrimeNumbers2();
        long finish2 = System.nanoTime();;

        System.out.println("printPrimeNumbers : " + (finih1 - start1));
        System.out.println("printPrimeNumbers2: " + (finish2 - start2));


    }
    public static void printPrimeNumbers(){
        int counter =0;

        for(int i=2; i<=1000;i++){
            boolean isPrime = true;

            for(int k = 2; k<i;k++){
                if( i%k==0){
                    isPrime=false;
                    break;
                }
            }

            if (isPrime){
                System.out.println(i);
                counter++;
            }
        }
        System.out.println("Number of prime numbers between 0 and 1000: " + counter);
    }

    public static void printPrimeNumbers2(){
        int counter =1;
        System.out.println(2);
        for(int i=3; i<=1000;i+=2){
            boolean isPrime = true;

            for(int k = 3; k<i;k+=2){
                if( i%k==0){
                    isPrime=false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(i);
                counter++;
            }
        }
        System.out.println("Number of prime numbers between 0 and 1000: " + counter);
    }
}
