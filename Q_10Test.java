/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ADMIN
 */
public class Q_10Test {
    
    public Q_10Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of countArm method, of class Q_10.
     */
    @Test
    public void testCountArm() {
        System.out.println("countArm");
        Q_10 instance = new Q_10();
        int expResult = 13;
        int result = instance.countArm();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
}
