/**
 * Name: Guancheng Huang
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/01/2024
 * File Name: Main.java
 * Description: This class is responsible for running the program.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.coffeemachine.Beverage;

import edu.bu.met.cs665.coffeemachine.Espresso;
import edu.bu.met.cs665.coffeemachine.Machine;

/**
 * This is the Main class.
 */
public class Main {

  /**
   * A main method to run examples.
   * You may use this method for development purposes as you start building your
   * assignments/final project.  This could prove convenient to test as you are developing.
   * However, please note that every assignment/final projects requires JUnit tests.
   */
  public static void main(String[] args) {

    Machine m1 = new Machine();
    m1.showMenu();
    Beverage bev = m1.makeDrink();
    m1.addMilk(bev);
    m1.addSugar(bev);
    m1.calculatePrice(bev);
    m1.showDrink(bev);




  }

  /**
   * This method performs XYZ and returns String.
   *
   * @return String
   */
//  private String doIt() {
//    Person student = new Person("John", "Doe");
//    return student.getLastName() + ',' + student.getFirstName();

//  }

}
