package be.intecbrussel.chapter7;

import java.util.Random;

public class InsertionSort {

    public static void main(String[] args) {
        Random rand = new Random();

        int limit = 50;
        int[] numbers = new int[limit];
        numbers = fillRandomArray(rand, numbers);
        printArr(numbers);
        numbers = insertionSort(numbers);
        System.out.println();
        printArr(numbers);


    }

    public static int[] fillRandomArray(Random rand, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        return arr;
    }

    public static int[] insertionSort(int[] nums) {
        int key=0;
        for (int j = 0; j <nums.length; j++) {
            key =nums[j];
            for (int i = j; i < nums.length - 1; i++) {
                if (key > nums[i + 1]) {
                    nums[i] = nums[i + 1];
                    nums[i + 1] = key;

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
