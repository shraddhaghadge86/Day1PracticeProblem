package com.shraddha;

import java.util.Scanner;

public class EqualStrings {
    public static void main(String[] args){

        Scanner str1 = new Scanner(System.in);
        Scanner str2 = new Scanner(System.in);
        System.out.println("Enter 2 strings: ");
        String s1 = str1.nextLine();
        String s2 = str2.nextLine();
        System.out.println("String1 is: "+s1);
        System.out.println("String2 is: "+s2);
        if(s1.equals(s2))
            System.out.println("Strings are same");

        else
            System.out.println("Strings are not same");

    }
}
