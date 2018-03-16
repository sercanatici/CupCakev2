/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;

/**
 *
 * @author tobbe
 */
public class GetOrder {
    int orderId;
    String date;
    ArrayList<LineItem> array;
    int totalPrice;

    public GetOrder(int orderId, String date, ArrayList<LineItem> array, int totalPrice) {
        this.orderId = orderId;
        this.date = date;
        this.array = array;
        this.totalPrice = totalPrice;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ArrayList<LineItem> getArray() {
        return array;
    }

    public void setArray(ArrayList<LineItem> array) {
        this.array = array;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "GetOrder{" + "orderId=" + orderId + ", date=" + date + ", array=" + array + ", totalPrice=" + totalPrice + '}';
    }
    
    
    
}
