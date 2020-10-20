package be.intecbrussel.chapter7;

import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        int number=7;
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=number;
            number+=7;
        }
        //printNormal(arr);
        printReverse(arr);
    }

    public static void printNormal(int[] nums) {

        for (int num: nums) {
            System.out.print(num + " ");
        }
    }
    public static void printReverse(int[] nums) {

        for (int i = nums.length-1; i >= 0 ; i--) {
            System.out.print(nums[i] + " ");
        }
    }
}
