/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classfactory;

/**
 *
 * @author Elikem
 * @version 3.0
 */
public class ShapeFactory {
    //use getShape method to get object of type shape 
   public Shapes getShape(String shapeType){
      if(shapeType == null ||shapeType.isEmpty()){
         return null;
      }		
      if(shapeType.equalsIgnoreCase("CIRCLE")){
         return new circle();
         
      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();
         
      } else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new Square();
      }
      
      return null;
   }
}

