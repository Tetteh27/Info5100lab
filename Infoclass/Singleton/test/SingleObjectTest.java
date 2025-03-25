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
 * @author ProBook
 */
public class SingleObjectTest {
    
    public SingleObjectTest() {
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
     * Test of getInstance method, of class SingleObject.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        SingleObject expResult = SingleObject.getInstance();
        SingleObject result = SingleObject.getInstance();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of showMessage method, of class SingleObject.
     */
    @Test
    public void testShowMessage() {
        System.out.println("showMessage");
        SingleObject so = SingleObject.getInstance();
        
        String expResult = "Hello World";
        String result = so.showMessage();
        assertEquals(expResult, result);
        
        expResult = "Hello Singleton";
        result = so.showMessage();
        assertNotEquals(expResult, result);
        
    }
    
}
