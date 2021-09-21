package com.sci.week_six;

import java.util.Scanner;

public class PriceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the price without Vat");
        double basePrice = scanner.nextInt();

        System.out.println("Please enter the amount of Vat in procentage (%)");
        double vat = scanner.nextInt();

        calculatePrice(basePrice, vat);
    }
    public static void calculatePrice(double basePrice, double vat) {
        System.out.println("Your total price is " + (basePrice * ((100 + vat) / 100)));
    }
}
