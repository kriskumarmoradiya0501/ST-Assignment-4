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
public class Q_5Test {
    
    public Q_5Test() {
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
     * Test of countchar method, of class Q_5.
     */
    @Test
    public void testCountchar() {
        System.out.println("countchar");
        String str = "abcd12345/*-++.";
        Q_5 instance = new Q_5();
        int[] expResult = {5,4,6};
        int[] result = instance.countchar(str);
        assertArrayEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
}
