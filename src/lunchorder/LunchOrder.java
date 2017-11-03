/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lunchorder;
import java.util.Scanner;
import java.text.NumberFormat;
        
/**
 *
 * @author jomui8426
 */
public class LunchOrder {


    /**
     * A lunch order is simulated. There is the costs, and nutrition values.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Foods hamburger = new Foods("Hamburger", 1.85, 9.0, 33.0, 1.0);
        Foods salad = new Foods("Salads", 2.00, 1.0, 11.0, 5.0);
        Foods fries = new Foods("Fries", 1.30, 11.0, 36.0, 4.0);
        Foods sodas = new Foods("Sodas", 0.95, 0.0, 38.0, 0.0);
        int data;
        Scanner input = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();

        /**
         * Prints out the the data for each food and also takes input for an amount of food wanted. 
         */
        System.out.println("Enter number of hamburgers");data = input.nextInt();
        hamburger.add(data);
        System.out.println("Each hamburger has " + hamburger);
        
        System.out.println("Enter number of salads");data = input.nextInt();
        salad.add(data);
        System.out.println("Each salad has " + salad);
        
        System.out.println("Enter number of fries ");data = input.nextInt();
        fries.add(data);
        System.out.println("French Fries have " + fries);
        
        System.out.println("Enter number of sodas ");data = input.nextInt();
        sodas.add(data);
        System.out.println("Each soda has " + sodas);
        
       
    }
    
}
