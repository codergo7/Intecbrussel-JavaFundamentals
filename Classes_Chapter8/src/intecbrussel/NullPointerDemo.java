package intecbrussel;

import java.util.Scanner;

public class NullPointerDemo {
    private Scanner scanner;

    {
        //scanner = new Scanner(System.in());
    }


    public int getIntFromUser(){
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        NullPointerDemo npd = new NullPointerDemo();
        System.out.println(npd.getIntFromUser()); // NullPointerException
    }
}
