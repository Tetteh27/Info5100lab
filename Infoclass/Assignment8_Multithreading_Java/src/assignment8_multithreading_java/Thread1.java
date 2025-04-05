/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment8_multithreading_java;

/**
 * Thread1 plays do, mi, sol, si, do-octave.
 * @author ProBook
 */
public class Thread1 extends Thread {
    
    String [] tones = {"do.wav", "mi.wav", "sol.wav", "si.wav","do-octave.wav"};
    FilePlayer fp = new FilePlayer();
    
    @Override
    public void run(){
        for (String tone: tones){
            try{
                fp.play("C:\\Users\\ProBook\\OneDrive\\Documents\\NetBeansProjects\\Assignment8_Multithreading_Java\\src\\assignment8_multithreading_java\\Sounds\\"+tone);
                System.out.println("Thread1 played"+tone);
                Thread.sleep(500);
            } catch(Exception e){
                e.printStackTrace();
            }
            
       
        }
    } 
}
