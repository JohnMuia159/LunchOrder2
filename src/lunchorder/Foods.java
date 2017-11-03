/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lunchorder;
import java.text.NumberFormat;
/**
 *
 * @author jomui8426
 */
public class Foods {
    private String name;
    private double cost, fat, carbs, fiber;
    
    /**
     * Foods object is created and the cost, and nutrition facts are set.
     * @param food
     * @param amount
     * @param fa
     * @param ca
     * @param fi 
     */
    
    public Foods(String food, double amount, double fa, double ca, double fi){
        name=food;
        cost=amount;
        fat=fa;
        carbs=ca;
        fiber=fi;
    }
    
	
    /**
     * Adds data
     * @param amount 
     */
    public void add(int amount){
        cost += amount;
    }
    
    /**
     * Prints out the grams of fat the carbs and the fiber. 
     * @return 
     */
    public String toString() {
		String nameString;
	
		nameString = fat + "g of fat " + carbs + "g of carbs " + fiber + "g of fiber" + "\n"; 
	 	return(nameString);
    }
}

