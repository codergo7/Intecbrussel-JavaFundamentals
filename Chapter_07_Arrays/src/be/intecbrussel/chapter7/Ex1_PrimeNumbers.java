package be.intecbrussel.chapter7;

public class Ex1_PrimeNumbers {
    public static void main(String[] args) {
        int limit = 100;
        int[] primes = new int[limit];


        for(int i=2, j=0; i<5000 && j<limit; i++){
            if(isPrime(i,primes,j)){
                primes[j++] = i;
            }

        }
        printArr(primes);
    }
    public static boolean isPrime(int num,int[] nums, int limit){
        for (int i=0; i<limit;i++) {
            if(num% nums[i]==0) return false;
        }
        return true;
    }
    public static void printArr(int[] nums){
        for (int num: nums) {
            System.out.println(num);
        }
    }
}
