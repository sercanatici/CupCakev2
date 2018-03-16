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
public class Bottom {
    int id;
    String bname;
    int price;
    
    public Bottom(int id, String bname, int price){
        this.id = id;
        this.bname = bname;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bottom{" + "id=" + id + ", bname=" + bname + ", price=" + price + '}';
    }
    
    
}
