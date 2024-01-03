package org.launchcode;

import java.util.Scanner;

public class GasConsumption {
    public static void main(String[] args) {
        double milesDriven;
        double gasAmount;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of miles you have driven: ");
        milesDriven = input.nextDouble();
        System.out.println("Enter the amount of gas you have consumed in gallons: ");
        gasAmount = input.nextDouble();
        input.close();

        double milesPerGallon = milesDriven / gasAmount;
        System.out.println("You consumed " + milesPerGallon + " miles-per-gallon.");
    }
}
