package be.intecbrussel.chapter7;

import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        Random rand = new Random();

        int limit = 50;
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
        // time complexity is O(n) in the best case, O(n*n) in the worst complexity
        int amountOfSwap=0;
        for (int j = 0; j <nums.length; j++) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    int a = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = a;
                    amountOfSwap++;
                }
            }
            if(amountOfSwap==0) {
                System.out.println("here" + j);
                break;
            }
            amountOfSwap=0;
        }
        return nums;
    }

    public static void printArr(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
