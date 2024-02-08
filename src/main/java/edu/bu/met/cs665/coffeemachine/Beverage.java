package edu.bu.met.cs665.coffeemachine;
/**
 * Name: guancheng Huang
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/01/2024
 * File Name: beverage.java
 * Description: This class is responsible for the methods and attributes of Beverage, which is the parent class of all drink.
 */
public class Beverage {
    private double price;
    private String drinkName;
    private int milkLevel;
    private int sugarLevel;

    public Beverage(double price, String drinkName, int milkLevel, int sugarLevel){
            super();
            this.price = price;
            this.drinkName = drinkName;
            this.milkLevel = milkLevel;
            this.sugarLevel = sugarLevel;
    }

    public double getPrice(){ return price;}
    public double setPrice(double price){ return  this.price = price;}

    public String getDrinkName(){ return drinkName;}
    public String setDrinkName(){ return this.drinkName = drinkName;}

    public int getMilkLevel() {
        return milkLevel;
    }
    public void setMilkLevel(int milkLevel) {
        this.milkLevel = Math.max(0, Math.min(milkLevel, 3));
//            this.milkLevel = milkLevel;
    }

    public int getSugarLevel() {
        return sugarLevel;
    }
    public void setSugarLevel(int sugarLevel) {
        this.sugarLevel = Math.max(0, Math.min(sugarLevel, 3));
//        this.sugarLevel = sugarLevel;
    }
}


