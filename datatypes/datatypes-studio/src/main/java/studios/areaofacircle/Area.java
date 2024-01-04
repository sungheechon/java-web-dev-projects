package studios.areaofacircle;

import java.util.Scanner;

public class Area {

    /* main solution
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius: ");
        double inputRadius = input.nextDouble();
        double resultArea = Circle.getArea(inputRadius);

        System.out.println("The area of a circle of radius " + inputRadius + " is: " + resultArea);
        input.close();
    }
     */

    // Bonus solution 1

    /*public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius: ");
        if (input.hasNextDouble()) {
            double inputRadius = input.nextDouble();

            if (inputRadius > 0) {
                double resultArea = Circle.getArea(inputRadius);
                System.out.println("The area of a circle of radius " + inputRadius + " is: " + resultArea);
            } else {
                System.out.println("You entered a negative number!");
            }

        } else {
            System.out.println("You entered an invalid number. Goodbye!");
        }
        input.close();
    }
    */

    // Bonus solution 2
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double inputRadius;

        do {
            System.out.println("Enter a positive number for the radius: ");

            while (!input.hasNextDouble()) {
                System.out.println("Please enter a valid number! Enter again: ");
                input.next();
            }
            inputRadius = input.nextDouble();
        } while (inputRadius <= 0);

        double resultArea = Circle.getArea(inputRadius);
        System.out.println("The area of a circle of radius " + inputRadius + " is: " + resultArea);

        input.close();
    }


}
