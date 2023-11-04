/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mm;
public class Food {
    private int id; // this is id from database
    private String foodName; // from database
    private double price; // from database

    public Food(int id, String foodName, double price){
        this.id = id;
        this.foodName = foodName;
        this.price = price;
    }

    public int getId(){ return id; }
    public String getFoodName() { return foodName; }
    public double getPrice() { return price;}
}

