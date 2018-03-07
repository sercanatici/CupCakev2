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
public class Topping {
    int id;
    String tname;
    int price;
    
    
    public Topping(int id, String tname, int price){
        this.id = id;
        this.tname = tname;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Topping{" + "id=" + id + ", tname=" + tname + ", price=" + price + '}';
    }
    
    
}
