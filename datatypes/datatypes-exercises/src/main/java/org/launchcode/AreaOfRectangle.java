package org.launchcode;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the rectangle's length: ");
        int rectangleLength = input.nextInt();
        System.out.println("Enter the rectangle's width: ");
        int rectangleWidth = input.nextInt();
        input.close();

        int rectangleArea = rectangleLength * rectangleWidth;
        System.out.println("The area of your fabulous rectangle is: " + rectangleArea);

    }
}
