package edu.bu.met.cs665.coffeemachine;

import java.util.Scanner;

public class Machine {
    private double milkPrice =0.5;
    private double sugarPrice = 0.1;

    public void showMenu() {
        System.out.println("------------------------\n"+
                "Hello! coffee machine here, choose ur drink!\n" +
                        "Here is the menu: Espresso 1.8$, Americano 1.8$, Latte 2.0$\nAll tea 1.2$, Milk 0.5$, Sugar 0.1$");
    }

    public static Beverage makeDrink() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("choose ur drink coffee or tea \n enter 'a' for coffee, 'b' for tea");

        String choice = scanner.nextLine(); // Read user input

        switch (choice) {
            case "a":
                System.out.println("what kind of coffee? ");
                String coffeeChoice = scanner.nextLine();
                switch (coffeeChoice) {
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
                System.out.println("which tea? ");
                String teaChoice = scanner.nextLine();
                switch (teaChoice) {
                    case "a":
                        return new BlackTea("sleep tea", 114.514);

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
        System.out.println("ur drink:" + bev.getDrinkName());
        System.out.println("sugar:" + bev.getSugarLevel());
        System.out.println("milk: " + bev.getMilkLevel());
        System.out.println("price:" + bev.getPrice());// has problem
    }

}
