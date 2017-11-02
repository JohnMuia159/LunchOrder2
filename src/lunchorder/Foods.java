/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lunchorder;

/**
 *
 * @author jomui8426
 */
public class Foods {
    private String name;
    private double cost, fat, carbs, fiber;
    
    
    public Foods(String food, double amount, double fa, double ca, double fi){
        name=food;
        cost=amount;
        fat=fa;
        carbs=ca;
        fiber=fi;
    }
        
}

