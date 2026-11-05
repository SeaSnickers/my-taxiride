package com.mycompany.taxiride;
import java.util.Scanner;
/**
 *Author: Jeremy/SeaSnickers
 */
public class Taxiride {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // ===== Part A: Greeting & Name =====
        System.out.print("Enter your name: ");
        String name = in.nextLine();   // read a string from the user
        System.out.println("Welcome to Nowhere's Taxi Service, " + name + "!");
        
        // ===== Part B: Trip Inputs =====
        System.out.print("How much distance do you want to cross? ");
        double distance = in.nextDouble();   // read a double from the user
        System.out.println("We will cross " + distance + " miles.");
        
        
	System.out.print("How long do you want to go for? ");
	int time = in.nextInt();   // read an integer from the user
        System.out.println("This trip will take " + time + " minutes.");
        
        // ===== Part C: Fare Calculation =====
        // Rates
        final double BASE = 2.50;
        final double PER_MILE = 1.75;
        final double PER_MIN = 0.25;

        double distancePrice = (distance * PER_MILE)/BASE;
        double timePrice = (time * PER_MIN)/BASE;
        double fare = BASE + (distance * PER_MILE) + (time * PER_MIN);
        System.out.println("The fare price is $" + fare);
        
        // ===== Part D: Casting =====
        int cashFare = (int) fare;
        System.out.println("You will pay $" + cashFare + " in cash.");
        
        /// ===== Part E: Final Receipt =====
        System.out.println("---- Ride Receipt ----");
        System.out.println("Name: " + name);
        System.out.println("Miles: " + distance);
        System.out.println("Minutes: " + time);
        System.out.println("Exact Fare: $" + fare);
        System.out.println("Cash Fare: $" + cashFare);
    }
}
