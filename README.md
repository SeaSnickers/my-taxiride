# my taxiride
lab 3 simple test for taxi server 

# how to use:
1. In a Java IDE such as Apache NetBeans, create a project with the name: Taxiride.
2. Make sure the scanner object is put in at the top: import java.util.Scanner;
3. Make sure it is also named within the project: Scanner in = new Scanner(System.in);
4. Input your name.
        System.out.print("Enter your name: ");
        String name = in.nextLine();   // read a string from the user
        System.out.println("Welcome to Nowhere's Taxi Service, " + name + "!");
5. Input the distance you want to travel. Only use numbers.
        // ===== Part B: Trip Inputs =====
        System.out.print("How much distance do you want to cross? ");
        double distance = in.nextDouble();   // read a double from the user
        System.out.println("We will cross " + distance + " miles.");
6. Input how long you want it to take. Only use integers.
	System.out.print("How long do you want to go for? ");
	int time = in.nextInt();   // read an integer from the user
        System.out.println("This trip will take " + time + " minutes.");
7. Enter, and have a fun ride when you run the code.

# author
Jeremy (SeaSnickers)

## Collaboration Acknowledgment
This project was reviewed and edited by misery.
