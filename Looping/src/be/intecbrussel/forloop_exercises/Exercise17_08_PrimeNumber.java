package be.intecbrussel.forloop_exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise17_08_PrimeNumber {

    public static ArrayList<Integer> primeList = new ArrayList<>();
    public static final int limit = 1_000_000;

    public static void main(String[] args) {
        //long start1 = System.currentTimeMillis();
       /* long start1 = System.nanoTime();
        printPrimeNumbers();
        long finish1 = System.nanoTime();


        */
        long start2 = System.nanoTime();
        printPrimeNumbers2();
        long finish2 = System.nanoTime();

        long start3 = System.nanoTime();
        printPrimeNumbers3();
        long finish3 = System.nanoTime();

        long start4 = System.nanoTime();
        printPrimeNumbers4();
        long finish4 = System.nanoTime();

        long start5 = System.nanoTime();
        printPrimeNumbers5();
        long finish5 = System.nanoTime();

       // System.out.println("printPrimeNumbers : " + (finish1 - start1));
        System.out.println("printPrimeNumbers2: " + (finish2 - start2));
        System.out.println("printPrimeNumbers3: " + (finish3 - start3));
        System.out.println("printPrimeNumbers4: " + (finish4 - start4));
        System.out.println("printPrimeNumbers5: " + (finish5 - start5));
    }

    public static void printPrimeNumbers(){
        int counter =0;

        for(int i=2; i<=limit;i++){
            boolean isPrime = true;

            for(int k = 2; k<i;k++){
                if( i%k==0){
                    isPrime=false;
                    break;
                }
            }

            if (isPrime){
                //System.out.println(i);
                counter++;
            }
        }
        System.out.println("Number of prime numbers between 0 and 1000: " + counter);
    }

    public static void printPrimeNumbers2(){
        int counter =1;
        //System.out.println(2);
        for(int i=3; i<=limit;i+=2){
            boolean isPrime = true;

            for(int k = 3; k<i;k+=2){
                if( i%k==0){
                    isPrime=false;
                    break;
                }
            }
            if (isPrime){
                //System.out.println(i);
                counter++;
            }
        }
        System.out.println("Number of prime numbers between 0 and 1000: " + counter);
    }
    public static void printPrimeNumbers3(){
        int counter =0;
       // System.out.println(2);
        for(int i=2; i<=limit;i++){
            boolean isPrime = true;

            for(int k = 2; k<=i/2;k++){
                if( i%k==0){
                    isPrime=false;
                    break;
                }
            }
            if (isPrime){
                //System.out.println(i);
                counter++;
            }
        }
        System.out.println("Number of prime numbers between 0 and 1000: " + counter);
    }

    public static void printPrimeNumbers4(){
        int counter =1;
        // System.out.println(2);
        for(int i=3; i<=limit;i+=2){
            boolean isPrime = true;

            for(int k = 2; k<=Math.sqrt(i);k++){
                if( i%k==0){
                    isPrime=false;
                    break;
                }
            }
            if (isPrime){
                //System.out.println(i);
                counter++;
            }
        }
        System.out.println("Number of prime numbers between 0 and 1000: " + counter);
    }

    public static void printPrimeNumbers5(){
        int counter =1;
        // System.out.println(2);
        for(int i=3; i<=limit;i+=2){
            boolean isPrime = true;

            for(Integer k: primeList){
                if( k>Math.sqrt(i)){
                    break;
                }
                if(i%k == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                //System.out.println(i);
                primeList.add(i);
                counter++;
            }
        }
        System.out.println("Number of prime numbers between 0 and 1000: " + counter);
    }
    public static void printPrimeNumbers6(){

        int counter = 0;

        boolean[] primes = new boolean[1_000_000];
        Arrays.fill(primes, true);

        for(int number=0; number<primes.length; number++){

        }

        System.out.println("Number of prime numbers between 0 and 1000: " + counter);
    }
}
