package com.shraddha;

public class CmdLineSum {
    public static void main(String args[]) {

        int sum = 0;
        System.out.println("Calculating sum of integers is: ");
        for (int i = 0; i < args.length; i++) {
            try {
                sum = sum + Integer.parseInt(args[i]);
            } catch (Exception e) {
                System.out.println("Invalid integer: " + args[i]);
            }
        }
        System.out.println("Sum: " + sum);

    }
}
