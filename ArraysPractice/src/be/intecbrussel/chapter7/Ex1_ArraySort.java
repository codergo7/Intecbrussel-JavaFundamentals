package be.intecbrussel.chapter7;

import java.util.Random;

public class Ex1_ArraySort {
    public static void main(String[] args) {
        Random rand = new Random();

        int limit = 100;
        int[] numbers = new int[limit];
        numbers = fillRandomArray(rand, numbers);
        printArr(numbers);
        numbers = bubbleSortArray(numbers);
        System.out.println();
        printArr(numbers);


    }

    public static int[] fillRandomArray(Random rand, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        return arr;
    }

    public static int[] bubbleSortArray(int[] nums) {

        for (int j = 0; j <100; j++) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    int a = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = a;
                }
            }
        }

        return nums;
    }

    public static void printArr(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
