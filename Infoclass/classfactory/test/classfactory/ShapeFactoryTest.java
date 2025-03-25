/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package classfactory;



import static org.junit.Assert.assertEquals;

import org.junit.Test;


/**
 *
 * @author ProBook
 */
public class ShapeFactoryTest {
    
     
    
        /**
     * Test of getShape method, of class ShapeFactory.
     */
    @Test
    public void testGetShape() {
        System.out.println("getShape");
        String shapeType = "";
        ShapeFactory instance = new ShapeFactory();
        Shapes expResult = null;
        Shapes result = instance.getShape(shapeType);
        assertEquals(expResult, result);
       
        shapeType = "CIRCLE";
        expResult = new circle();
        result = instance.getShape(shapeType);
        assertEquals(expResult.getClass(), result.getClass());
        
        shapeType = "RECTANGLE";
        expResult = new Rectangle();
        result = instance.getShape(shapeType);
        assertEquals(expResult.getClass(), result.getClass());
        
        shapeType = "SQUARE";
        expResult = new Square();
        result = instance.getShape(shapeType);
        assertEquals(expResult.getClass(), result.getClass());
    }
    
}
