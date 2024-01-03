package studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double inputRadius = input.nextDouble();
        double resultArea = Circle.getArea(inputRadius);
        System.out.println("The area of a circle of radius " + inputRadius + " is: " + resultArea);
        input.close();
    }
}
