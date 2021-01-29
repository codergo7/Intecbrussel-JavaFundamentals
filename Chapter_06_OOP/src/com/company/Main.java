package com.company;

public class Main {

    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "Hello World";
        String str3 = new String("hEllo");
        String str4 = new String("hEllo");




        System.out.println(str1==str2);
        System.out.println(str3==str4);
        System.out.println(str3.equals(str4));

    }
}
