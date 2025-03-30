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
public class Q_6Test {
    
    public Q_6Test() {
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
     * Test of countOccurence method, of class Q_6.
     */
    @Test
    public void testCountOccurence() {
        System.out.println("countOccurence");
        String str = "ubeijercjwenfuwenonwiskemdadkl2qpcnkwn";
        char c = 'e';
        Q_6 instance = new Q_6();
        int expResult = 5;
        int result = instance.countOccurence(str, c);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
}
