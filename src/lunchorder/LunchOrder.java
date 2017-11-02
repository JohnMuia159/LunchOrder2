/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lunchorder;
import java.util.Scanner;
/**
 *
 * @author jomui8426
 */
public class LunchOrder {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Foods hamburger = new Foods("Hamburger", 1.85, 9.0, 33.0, 1.0);
        Foods salad = new Foods("Salads", 2.00, 1.0, 11.0, 5.0);
        Foods fries = new Foods("Fries", 1.30, 11.0, 36.0, 4.0);
        Foods sodas = new Foods("Sodas", 0.95, 0.0, 38.0, 0.0);
        Scanner input = new Scanner(System.in);
        
        System.out.println(hamburger);
        System.out.println(salad);
        System.out.println(fries);
        System.out.println(sodas);        
        
        
    }
    
}
