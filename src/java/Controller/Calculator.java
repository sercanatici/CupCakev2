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
    
    /**
     *Adds int a and int b
     * @param a
     * @param b
     * @return int
     */
    public int Calculate(int a, int b){
        int res = a + b;
        return res;
    }
     
    /**
     *Adds int a and int b and multiplies the result with int q
     * @param a
     * @param b
     * @param q
     * @return int
     */
    public int CalculateQuantity(int a, int b, int q){
        int res = (a + b) * q;
        return res;
    }
}
