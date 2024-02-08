package edu.bu.met.cs665.coffeemachine;
/**
 * Name: guancheng Huang
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/01/2024
 * File Name: Machine.java
 * Description: This class is responsible for the methods and attributes of machine, which will make drinks.
 */
import java.util.Scanner;

public class Machine {
    private double milkPrice = 0.5;
    private double sugarPrice = 0.1;

    public void showMenu() {
        System.out.println("--------------------------------------\n" +
                "Hello! coffee machine here, here is the menu: \n" +
                "☕Coffee: Espresso 1.8$, Americano 1.8$, Latte 2.2$\n" +
                "🍵Tea: black tea, green tea, yellow tea. All tea 1.2$\n" +
                "Additional milk&sugar: Milk 0.5$/unit, Sugar 0.1$/unit\n" +
                "-----------------------------------------------"
        );
    }

    public Beverage makeDrink() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("choose ur drink coffee or tea \n enter 'a' for coffee, 'b' for tea");
        String choice = scanner.nextLine(); // Read user input
        System.out.println(choice.equals("a") ? "what kind of coffee? 'a' for Espresso, 'b' for Americano, 'c' for Latte " : "which tea? ");
        String specificChoice = scanner.nextLine();
        return order(choice, specificChoice);
    }

    public Beverage order(String choice, String specificChoice) {

        switch (choice) {
            case "a":
                switch (specificChoice) {
                    case "a":

                        return new Espresso();

                    case "b":
                        return new Americano();

                    case "c":
                        return new Latte();

                    default:
                        break;

                }
            case "b":
                switch (specificChoice) {
                    case "a":
                        return new BlackTea();

                    case "b":
                        return new GreenTea();

                    case "c":
                        return new YellowTea();
                    default:
                        break;
                }
        }
        return null;
    }

    public Beverage addMilk(Beverage bev) {
        System.out.println("any milk? u can add 0 to 3 units of milk");
        Scanner scanner = new Scanner(System.in);
        int milkunit = scanner.nextInt();
        bev.setMilkLevel(milkunit);
        return bev;
    }

    public Beverage addSugar(Beverage bev) {
        System.out.println("and any sugar? u can add 0 to 3 units of sugar");
        Scanner scanner = new Scanner(System.in);
        int sugarUnit = scanner.nextInt();
        bev.setSugarLevel(sugarUnit);
        return bev;
    }

    public Beverage calculatePrice(Beverage bev) {
        double finalPrice = bev.getPrice() + milkPrice * bev.getMilkLevel() + sugarPrice * bev.getSugarLevel();
        bev.setPrice(finalPrice);
        return bev;

    }

    public void showDrink(Beverage bev) {

        // System.out.printf("Here is ur drink:" %s", have a nice
        // day:-)",bev.getDrinkName(),);
        System.out.println("------------receipt-----------------------");
        System.out.println("ur drink:" + bev.getDrinkName());
        System.out.println("sugar:" + bev.getSugarLevel());
        System.out.println("milk: " + bev.getMilkLevel());
        System.out.printf("price:" + "%5.1f" , bev.getPrice());// has problem
    }

}
