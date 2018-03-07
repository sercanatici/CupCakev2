/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author tobbe
 */
public class Order {
    String bottom;
    String topping;
    int price;
    
    public Order(String bottom, String topping, int price){
        this.bottom = bottom;
        this.topping = topping;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order =" + "Topping: " + topping + ". Bottom: " + bottom + ". Price: " + price + ")";
    }
    
    
}
