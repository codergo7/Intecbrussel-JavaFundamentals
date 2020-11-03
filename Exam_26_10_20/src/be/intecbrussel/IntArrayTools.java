package be.intecbrussel;

public class IntArrayTools {

    //gives true if the parameter array is sorted in ascending order
    public static boolean isSorted(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                return false;
            }
        }
        return true;
    }



    // sorts the parameter array in ascending order with selection algorithm
    public static int[] sort(int[] numbers) {
        int indis = 0;
        for (int j = 0; j < numbers.length; j++) {
            int min = Integer.MAX_VALUE;

            for (int i = j; i < numbers.length; i++) {
                if (numbers[i] < min) {
                    min = numbers[i];
                    indis = i;
                }
            }
            int a = numbers[j];
            numbers[j] = min;
            numbers[indis] = a;
        }

        return numbers;
    }

    public static boolean chopchop(int[] numbers, int num){
        for (int number : numbers) {
            if(number == num) return true;
        }
        return false;
    }

    /*
    ********************   EXTRAS ***************
     */

    /*
    gives true if the parameter array is sorted in ascending order and
    second parameter is "a" or sorted in descending order and second parameter is not "a"
     */
    public static boolean isSortedExtra(int[] nums, String ascendingOrDescending) {
        if(ascendingOrDescending == "a"){
            return isSorted(nums);
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                return false;
            }
        }
        return true;
    }

    // sorts the parameter array in descending order using Insertion Sort Algorithm
    public static int[] sortExtra(int[] numbers, String ascendingOrDescending) {
        if(ascendingOrDescending=="a"){
            return sort(numbers);
        }

        int indis = 0;
        for (int j = 0; j < numbers.length; j++) {
            int max = Integer.MIN_VALUE;

            for (int i = j; i < numbers.length; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                    indis = i;
                }
            }
            int a = numbers[j];
            numbers[j] = max;
            numbers[indis] = a;
        }

        return numbers;
    }

   // sorts the parameter array in ascending order using Bubble Sort Algorithm
    public static int[] bubbleSortArray(int[] nums) {

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
                break;
            }
            amountOfSwap=0;
        }
        return nums;
    }

    // search the parameter number in the parameter array using Binary Search Algorithm
    public static boolean chopchopExtra(int[] numbers, int num){
        numbers= sort(numbers);

        int last= numbers.length-1;
        int mid = 0;
        int first = 0;
        while (first <last) {
            mid =first + (last - first)/2;
            if(numbers[mid]==num){
                return true;
            }
            else if(numbers[mid]>num){
                last=mid;
            }
            else {
                first = mid+1;
            }
        }
        return false;
    }

}


