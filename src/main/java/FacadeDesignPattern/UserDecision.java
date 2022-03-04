package FacadeDesignPattern;

import java.util.Scanner;

/**
 * This package shows a broad example of how a facade design pattern is programmed. This example is based off the
 * design model displayed in the presentation on slide 3.
 * @author Ashar Izhar
 */

/**
 * This is the main class that simply allows the user to decide what vehicle they want built. This class is very easy
 * for the user to interact with, and it successfully hides the "complexities" of the process behind the scenes from the
 * user which is the goal when implementing a facade design pattern.
 */
public class UserDecision {
    /**
     * The main method of the program. This function takes the user's decision and begins the "complex" processes
     * to build the selected vehicle.
     * @param args This represents any command-line arguments that may be present.
     */
    public static void main(String[] args) {
        VehicleBuilder newBuild = new VehicleBuilder();
        Scanner scan = new Scanner(System.in);
        boolean valid = false;

        while(!valid) {
            System.out.println("Which vehicle do you want to build?");
            System.out.println("1 - Car \n2 - Van\n3 - Truck");
            System.out.print("Please enter the number here -> ");
            int choice = scan.nextInt();
            switch (choice) {
                case 1 -> {
                    newBuild.buildCar();
                    valid = true;
                }
                case 2 -> {
                    newBuild.buildVan();
                    valid = true;
                }
                case 3 -> {
                    newBuild.buildTruck();
                    valid = true;
                }
                default -> {
                    System.out.println("Please enter a valid value!");
                }
            }
        }
    }
}
