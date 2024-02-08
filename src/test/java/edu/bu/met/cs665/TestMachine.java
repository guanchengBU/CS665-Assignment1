package edu.bu.met.cs665;

import edu.bu.met.cs665.coffeemachine.Beverage;
import edu.bu.met.cs665.coffeemachine.BlackTea;
import edu.bu.met.cs665.coffeemachine.Espresso;
import edu.bu.met.cs665.example1.Person;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import edu.bu.met.cs665.coffeemachine.Machine;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.verification.VerificationMode;

import java.util.Scanner;

import static org.mockito.Mockito.*;

public class TestMachine {
    Machine mach = new Machine();
    Beverage bevTest = new Beverage(1.8,"testDrink",0,0);
    @Test
    public void testOrderAmericano() {

        Beverage bev = mach.order("a", "b");
//        assertTrue(bev instanceof Espresso);
        assertEquals("Americano", bev.getDrinkName());
    }

    @Test
    public void testOrderGreenTea(){
        Beverage bev = mach.order("b", "b");
        assertEquals("Green Tea", bev.getDrinkName());
    }
    @Test
    public void testOrderLatte() {

        Beverage bev = mach.order("a", "c");
//        assertTrue(bev instanceof Espresso);
        assertEquals("Latte", bev.getDrinkName());
    }

    @Test
    public void testAddSugar(){
        bevTest.setSugarLevel(3);
        assertEquals(3,bevTest.getSugarLevel());

    }

    @Test
    public void testAddMilk(){

        bevTest.setMilkLevel(2);
        assertEquals(2,bevTest.getMilkLevel());
    }
    @Test
    public void testCalculatePrice(){
        bevTest.setSugarLevel(1);
        bevTest.setMilkLevel(2);
        mach.calculatePrice(bevTest);
        assertEquals(2.9, bevTest.getPrice(),0.001);
    }

}
