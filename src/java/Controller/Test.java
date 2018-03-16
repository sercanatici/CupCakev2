package Controller;


import Controller.User;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sidad
 */
public class Test {
    public static void main(String[] args) {

    DataAccess da = new DataAccess();
    Calculator calc = new Calculator();
    Calendar cal = Calendar.getInstance();
    
    
    da.newAccount(new User(200, "Tobias", "123"));
        //System.out.println(user.toString());
    User user = da.getUserByName("Tobias");
    //order 1
    Topping topping1 = da.getToppingByName("Crispy");
    Bottom bottom1 = da.getBottomByName("Chocolate");
    int quantity1 = 2;
    int price1 = calc.CalculateQuantity(bottom1.getPrice(), topping1.getPrice(), quantity1);
    Date date1 = cal.getTime();
        
    
    //order 2
    Topping topping2 = da.getToppingByName("Orange");
    Bottom bottom2 = da.getBottomByName("Nutmeg");
    int quantity2 = 5;
    int price2 = calc.CalculateQuantity(bottom2.getPrice(), topping2.getPrice(), quantity1);
    Date date2 = cal.getTime();
        
    
    LineItem lineItem1 = new LineItem(bottom1, topping1, quantity1, price1);
    LineItem lineItem2 = new LineItem(bottom2, topping2, quantity2, price2);
    ArrayList<LineItem> lia = new ArrayList();
    lia.add(lineItem1);
    lia.add(lineItem2);
    
    
    da.makeOrder(lia, user);
    
    
    ArrayList<GetOrder> array = da.getOrders(user);
    
        System.out.println(array.toString());    


   
    
         
           
}
}
