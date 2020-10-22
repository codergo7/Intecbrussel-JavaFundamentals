package be.intecbrussel.chapter7;

public class Statistics {
    public static void main(String[] args) {

        System.out.println("Average of the numbers: " + average(1, 2, 3, 4, 5));
        System.out.println("Max of the numbers: " + max(1, 2, 3, 4, 5));
        System.out.println("Min of the numbers: " + min(1, 2, 3, 4, 5));
    }
    public static int average(int... values){
        int sum=0;
        for (int value: values){
            sum+=value;
        }
        return values.length==0 ? 0 : sum/values.length;
    }
    public static int min(int... values){
        int min=Integer.MAX_VALUE;
        for (int value: values){
            min = Math.min(min,value);
        }
        return min;
    }
    public static int max(int... values){
        int max=Integer.MIN_VALUE;
        for (int value: values){
             max = Math.max(max,value);
        }
        return max;
    }
}
