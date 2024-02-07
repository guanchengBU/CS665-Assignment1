package edu.bu.met.cs665;

import edu.bu.met.cs665.coffeemachine.Beverage;
import edu.bu.met.cs665.example1.Person;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import edu.bu.met.cs665.coffeemachine.Machine;
import edu.bu.met.cs665.coffeemachine.Beverage;

import javax.crypto.Mac;

public class TestMachine {

    /**
     * Write some Unit tests for your program like the examples below.
     */

        public TestMachine() {

        }
    @Test
    public void testMakeDrink() {
        Machine mtest = new Machine();
        Beverage testbev = mtest.makeDrink();
        assertEquals("esspresso", testbev.getDrinkName());

    }
    @Test
    public void testAddMilk(){
            Machine m = new Machine();

            assertEquals(2,b.getMilkLevel());

    }






    }

