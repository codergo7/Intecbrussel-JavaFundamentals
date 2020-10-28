package be.intecbrussel.chapter7;

public class Ex1_Prime {
    public static void main(String[] args) {
        int limit = 500;
        int[] primes = new int[limit];
         int counter=0;

         for(int i=2, j=0; i<5000 && j<limit; i++){
             if(isPrime(i)){
                 primes[j++] = i;
                 System.out.print(i + " ");
             }

         }
        printArr(primes);
    }
    public static boolean isPrime(int num){
        for (int i = 2; i <num ; i++) {
            if(num%i==0) return false;
        }
        return true;
    }
    public static void printArr(int[] nums){
        for (int num: nums) {
            System.out.println(num);
        }
    }
}
