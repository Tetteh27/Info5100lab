/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facadeimplementation;

/**
 *
 * @author Elikem
 * @version 3.0
 */
public class shapemaker {
    private Shapes circle;
    private Shapes rectangle;
    private Shapes square;
    
    public shapemaker(){
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }
    
    public String drawCircle(){
        return circle.draw();
    }
    public String drawRectangle(){
        
        return rectangle.draw();
    }
    public String drawSquare(){
          return square.draw();
    }
}
