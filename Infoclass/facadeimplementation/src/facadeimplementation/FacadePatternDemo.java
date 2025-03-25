/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facadeimplementation;

/**
 *
 * @author ProBook
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        shapemaker shapemaker = new shapemaker();
        
        shapemaker.drawCircle();
        shapemaker.drawRectangle();
        shapemaker.drawSquare();
    }
}
