/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *singleeobject hw
 * @author Elikem
 * version 1.0
 */
public class SingleObject {
    //create an object of SingleObject
   private static SingleObject instance = new SingleObject();

   //make the constructor private so that this class cannot be
   //instantiated
   private SingleObject(){}
  
   //Get the only object available
   public static SingleObject getInstance(){
      return instance;
   }

   public String showMessage(){
      System.out.println("Hello World!");
      return "Hello World";
   }
}
