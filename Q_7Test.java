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
public class Q_7Test {
    
    public Q_7Test() {
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
     * Test of countOfDiv method, of class Q_7.
     */
    @Test
    public void testCountOfDiv() {
        System.out.println("countOfDiv");
        int[] a = {5,3,5,4,1,2,168,613,316,31,6};
        Q_7 instance = new Q_7();
        int expResult = 1;
        int result = instance.countOfDiv(a);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
}
