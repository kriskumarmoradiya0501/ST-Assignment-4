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
public class Q_1Test {
    
    public Q_1Test() {
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
     * Test of prime method, of class Q_1.
     */
    @Test
    public void testPrime() {
        System.out.println("prime");
        int a = 5;
        Q_1 instance = new Q_1();
        boolean expResult = true;
        boolean result = instance.prime(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
