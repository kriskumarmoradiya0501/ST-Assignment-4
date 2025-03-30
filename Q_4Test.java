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
public class Q_4Test {
    
    public Q_4Test() {
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

    /*@Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of avg method, of class Q_4.
     */
    @Test
    public void testAvg() {
        System.out.println("avg");
        int a = 5;
        int b = 25;
        Q_4 instance = new Q_4();
        double expResult = 14.0;
        double result = instance.avg(a, b);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
