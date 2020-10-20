package be.intecbrussel.chapter7;

import java.util.Random;

public class Ex1_ArraySort {
    public static void main(String[] args) {
        Random rand = new Random();

        int limit = 50;
        int[] numbers = new int[limit];
        numbers = fillRandomArray(rand, numbers);
        printArr(numbers);
        //numbers = bubbleSortArray(numbers);
        numbers = selectionSortArray(numbers);
        System.out.println();
        printArr(numbers);


    }

    public static int[] fillRandomArray(Random rand, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        return arr;
    }
    public static int[] selectionSortArray(int[] nums) {
        int indis=0;
        for (int j = 0; j <nums.length; j++) {
            int min = Integer.MAX_VALUE;
            for (int i = j; i < nums.length; i++) {
                if (nums[i] < min) {
                    min = nums[i];
                    indis=i;
                }
            }
            int a= nums[j];
            nums[j]=min;
            nums[indis]=a;
        }

        return nums;
    }

    public static int[] bubbleSortArray(int[] nums) {

        for (int j = 0; j <nums.length - 1; j++) {
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
