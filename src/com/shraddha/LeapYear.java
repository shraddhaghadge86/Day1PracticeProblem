package com.shraddha;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){

        System.out.println("Enter a year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        int rem = (year%4);
        if(rem==0) {
            System.out.println("a leap year");
        }
        else {
            System.out.println("not a leap year");
        }

    }
}
