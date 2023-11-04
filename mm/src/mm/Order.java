/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mm;

import java.util.ArrayList;


public class Order {
    private int id; // eto ung umorder 
    private String fullName; // fullname ng umorder
    private ArrayList<Food> itemsOrdered; // Array list ng items that you ordered
    private double deliveryFee; // double since its fractional
    private double totAmount; // double total amount ordered since its fractional

public Order(int id, String fullName, ArrayList<Food> foodOrdered){
    this.id = id;
    this.fullName = fullName;
    this.itemsOrdered = foodOrdered;
    // replace line 21
        for(int i = 0 ; i < itemsOrdered.size() ; i ++){
            this.totAmount += itemsOrdered.get(i).getPrice();
            this.deliveryFee = 200;

        }
    }
}
       

