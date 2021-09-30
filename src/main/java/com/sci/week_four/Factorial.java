package com.sci.week_four;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number");
        long number = scanner.nextInt();

        int i = 1;
        long factorial= 1;

        while (i <= number) {
            factorial *= i;
            i++;
        }
        System.out.println("Factorial number of " + number + " = " + factorial);
    }
}
