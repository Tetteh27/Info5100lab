/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package facadeimplementation;

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
public class shapemakerTest {
    
    public shapemakerTest() {
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
     * Test of drawCircle method, of class shapemaker.
     */
    @Test
    public void testDrawCircle() {
        System.out.println("drawCircle");
        shapemaker instance = new shapemaker();
        String expResult = "Circle:: Draw() method.";
        String result = instance.drawCircle();
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of drawRectangle method, of class shapemaker.
     */
    @Test
    public void testDrawRectangle() {
        System.out.println("drawRectangle");
        shapemaker instance = new shapemaker();
        String expResult = "Inside Rectangle:: Draw() method.";
        String result = instance.drawRectangle();
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of drawSquare method, of class shapemaker.
     */
    @Test
    public void testDrawSquare() {
        System.out.println("drawSquare");
        shapemaker instance = new shapemaker();
        String expResult = "Inside Square:: Draw() method.";
        String result = instance.drawSquare();
        
        assertEquals(expResult, result);
        
    }
    
}
