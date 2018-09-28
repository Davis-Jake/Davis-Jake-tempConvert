/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program01;
import java.util.Scanner;
/**
 *
 * @author Jake
 */
public class Tempconvert {
    
    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
      double temperatureCelcius, temperatureFarenheit;
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter a temperature in degrees Celcius: ");
      temperatureCelcius = keyboard.nextDouble();
      
      temperatureFarenheit = (9*temperatureCelcius)/5+32;
      System.out.println("The temperature in degrees farenheit is " + temperatureFarenheit);
   }
   

}
