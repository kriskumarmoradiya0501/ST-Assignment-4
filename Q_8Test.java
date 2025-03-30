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
public class Q_8Test {
    
    public Q_8Test() {
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
     * Test of countTxt method, of class Q_8.
     */
    @Test
    public void testCountTxt() {
        System.out.println("countTxt");
        String path = "C:\\Users\\ADMIN\\OneDrive\\Desktop";
        Q_8 instance = new Q_8();
        int expResult = 2;
        int result = instance.countTxt(path);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
}
