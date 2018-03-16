/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.Date;

/**
 *
 * @author tobbe
 */
public class LineItem {
    Bottom bottom;
    Topping topping;
    int quantity;
    int price;

    public LineItem(Bottom bottom, Topping topping, int quantity, int price) {
        this.bottom = bottom;
        this.topping = topping;
        this.quantity = quantity;
        this.price = price;

        
    }

    public Bottom getBottom() {
        return bottom;
    }

    public void setBottom(Bottom bottom) {
        this.bottom = bottom;
    }

    public Topping getTopping() {
        return topping;
    }

    public void setTopping(Topping topping) {
        this.topping = topping;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "LineItem{" + "bottom=" + bottom + ", topping=" + topping + ", quantity=" + quantity + ", price=" + price + '}';
    }

    
    
}
