package Controller;


import Controller.User;
import java.util.ArrayList;

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
    DataAccess t = new DataAccess();
    Calculator calc = new Calculator();
     
    //t.newAccount("Tobias", "1234", 100);
        
    /*
        User newUser = t.getUserByName("Tobias");
        System.out.println(newUser.getId());
        System.out.println(t.getUserByName("abc").getId());
     */   
        
        //Topping topping = t.getToppingByName("Orange");
        //System.out.println(topping.toString());

        /*
        Bottom bottom = t.getBottomByName("Pistacio");
        System.out.println(bottom.getPrice());
        System.out.println(bottom.getId());
*/    
        /*
        String bottom = t.getBottomByName("Chocolate").getBname();
        String topping = t.getToppingByName("Chocolate").getTname();
        int price = calc.Calculate(t.getToppingByName("Chocolate").getPrice(), t.getBottomByName("Chocolate").getPrice());
        
        ArrayList<Order> ordertest = new ArrayList();
        ordertest.add(new Order(topping, bottom, price));
        System.out.println(ordertest.toString());
*/
        
        User user = t.getUserByName("Tobias");
        System.out.println(user.getId());
        //t.updateBalance("Tobias", 70);
        //User newUser = t.getUserByName("Tobias");
        //System.out.println(newUser.getBalance());

}

   
    
         
           
}
