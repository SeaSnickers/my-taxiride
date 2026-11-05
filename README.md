# my taxiride
lab 3 simple test for taxi server 

# how to use:
1. In a Java IDE such as Apache NetBeans, create a project with the name: Taxiride.
2. Make sure the scanner object is put in at the top: import java.util.Scanner;
3. Make sure it is also named within the project: Scanner in = new Scanner(System.in);
4. Input your name.
5. Input the distance you want to travel. Only use numbers.
6. Input how long you want it to take. Only use integers.
7. Enter, and have a fun ride when you run the code.

# Project Example:
```
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

```

# author
Jeremy (SeaSnickers)

## Collaboration Acknowledgment
This project was reviewed and edited by misery.
