package be.intecbrussel;

import java.util.Random;
import java.util.Scanner;

public class ArrayApp {

    public static void main(String[] args) {
        /*
        TEST FOR IntArrayTools
         */
        testIntArrayTools();


        //Test for CharArrayTools
        testCharArrayTools();


        // Not yet completed
        //CharArrayTools.printDict(CharArrayTools.generateDictionary(3));


    }

    public static void testCharArrayTools() {
        System.out.println("**********************  Filtered Alphabet ************************");
        char[] chars = {'a', 'b',',', '1', 'C', 'z', 'Z', 'A', '$', ')', 'é', 'a', 'b'};
        CharArrayTools.printCharArray(chars);
        System.out.println( "\nFiltered alphabet characters: ");
        chars = CharArrayTools.filterAlphabet(chars);
        CharArrayTools.printCharArray(chars);
        System.out.println("\n\n**********************  Sorted Alphabet ************************");


        chars = CharArrayTools.sortCharacters(chars);
        System.out.println("Sorted alphabet characters: ");
        CharArrayTools.printCharArray(chars);


    }

    public static void testIntArrayTools() {
        Random rand = new Random();

        int limit = 20;

        System.out.println("**********************  isSorted ************************");
        int[] numbers = new int[limit];
        numbers = fillRandomArray(rand, numbers);
        System.out.println("Random list: ");
        printArr(numbers);
        System.out.println("Is sorted?  " + IntArrayTools.isSorted(numbers));
        numbers = IntArrayTools.sort(numbers);
        System.out.println("Sorted list");
        printArr(numbers);

        System.out.println("**********************  isSorted_ascendingOrDescending ************************");
        numbers = fillRandomArray(rand, numbers);
        System.out.println("Random list: ");
        printArr(numbers);
        System.out.println("Is sorted descending order? " + IntArrayTools.isSortedExtra(numbers, "d"));

        System.out.println("\n**********************  Descending Sort ************************");
        numbers = fillRandomArray(rand, numbers);
        System.out.println("Random list: ");
        printArr(numbers);
        numbers = IntArrayTools.sortExtra(numbers, "d");
        printArr(numbers);

        System.out.println("**********************  Bubble Sort ************************");

        numbers = fillRandomArray(rand, numbers);
        System.out.println("Random list: ");
        printArr(numbers);
        numbers = IntArrayTools.bubbleSortArray(numbers);
        System.out.println("Sorted list: ");
        printArr(numbers);

        System.out.println("**********************  Chopchop ************************");
        numbers = fillRandomArray(rand, numbers);
        System.out.println("Random list: ");
        printArr(numbers);
        int number = 10;
        System.out.println("Is there " + number + " in number list? " + IntArrayTools.chopchop(numbers, 10));

        System.out.println("\n**********************  ChopchopExtra Binary Search ************************");
        numbers = fillRandomArray(rand, numbers);
        System.out.println("Random list: ");
        printArr(numbers);
        System.out.println("Is there " + number + " in number list? " + IntArrayTools.chopchopExtra(numbers, 10));
    }

    public static int[] fillRandomArray(Random rand, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        return arr;
    }

    public static void printArr(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
    }

}
