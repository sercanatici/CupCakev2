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
public class Calculator {
    
    
    public int Calculate(int a, int b){
        int res = a + b;
        return res;
    }
     
    public int CalculateQuantity(int a, int b, int q){
        int res = (a + b) * q;
        return res;
    }
}
