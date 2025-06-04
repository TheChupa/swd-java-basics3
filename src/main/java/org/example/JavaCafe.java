package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Represents the Java Cafe program.
 */
public class JavaCafe {
    private Scanner scanner = new Scanner(System.in);
    public List<String> order = new ArrayList<String>();
    public List<Number> prices = new ArrayList<Number>();
    int total = 0;
    public void updateTotal() {
       Number total = 0.0;
        for(Number price : prices) {

        }
    }

    /**
     * Runs the Java Cafe program. (Mauin menu)
     */
    public void run() {
        while(true) {
            System.out.println("Welcome to Java Cafe!");
            System.out.println("1. View Food Menu");
            System.out.println("2. View Drink Menu");
            System.out.println("3. View Current Order");
            System.out.println("4. Exit");

            String choice = scanner.nextLine();
            if (choice.equals("1")) {
                viewFoodMenu();
            } else if (choice.equals("2")) {
                viewDrinkMenu();
            } else if (choice.equals("3")) {
                viewCurrentOrder();
            } else if (choice.equals("4")) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    /**
     * Displays the food menu and allows the user to add items to the order.
     */
    public void viewFoodMenu() {
        while(true) {
            System.out.println("Food Menu");
            System.out.println("1. Sandwich $5");
            System.out.println("2. Salad $3");
            System.out.println("3. Soup $2");
            System.out.println("4. Dessert $4");
            System.out.println("5. Return to Main Menu");

            String choice = scanner.nextLine();
            if (choice.equals("1")) {
                order.add("Sandwich");
                prices.add(5);
            } else if (choice.equals("2")) {
                order.add("Salad");
                prices.add(3);
            } else if (choice.equals("3")) {
                order.add("Soup");
                prices.add(2);
            } else if (choice.equals("4")) {
                order.add("Dessert");
                prices.add(4);
            } else if (choice.equals("5")) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    /**
     * Displays the drink menu and allows the user to add items to the order.
     */
    public void viewDrinkMenu() {
        while(true) {
            System.out.println("Drink Menu");
            System.out.println("1. Coffee $1");
            System.out.println("2. Tea $1");
            System.out.println("3. Juice $3");
            System.out.println("4. Return to Main Menu");

            String choice = scanner.nextLine();
            if (choice.equals("1")) {
                order.add("Coffee");
                prices.add(1);
            } else if (choice.equals("2")) {
                order.add("Tea");
                prices.add(1);
            } else if (choice.equals("3")) {
                order.add("Juice");
                prices.add(3);
            } else if (choice.equals("4")) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    /**
     * Displays the current order.
     */
    public void viewCurrentOrder() {
        System.out.println("Current Order:");
        for (String item : order) {
            System.out.println(item);
        }
        System.out.println("$"+total +" is your total");
    }
}
