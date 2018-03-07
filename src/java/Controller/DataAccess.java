package Controller;

import Controller.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sidad
 */
public class DataAccess {

    private DBConnector conn;

    public DataAccess() {
        this.conn = new DBConnector();
    }

    public void newAccount(String username, String password, int balance) {
        try {
            Connection connect = conn.getConnection();
            final String sql = "INSERT INTO Accounts"
                    + "(username,pass,balance) "
                    + "VALUES (? ,? ,?)";
            PreparedStatement st = conn.getConnection().prepareStatement(sql);
            st.setString(1, username);
            st.setString(2, password);
            st.setInt(3, balance);
            st.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Failure");
        }
    }

    public User getUserByName(String name) {
        User output = null;
        try {
            final String sql = "Select * from Accounts where username='" + name + "'";
            PreparedStatement psmt = conn.getConnection().prepareStatement(sql);
            ResultSet rs = psmt.executeQuery();
            int id = 0;
            String username = name;
            String pass = "";
            int balance = 0;
            while (rs.next()) {
                id = rs.getInt("id");
                pass = rs.getString("pass");
                balance = rs.getInt("balance");
            }
            output = new User(id, balance, username, pass);
        } catch (SQLException ex) {
            return null;
        }
        return output;
    }

    public Topping getToppingByName(String name) {
        Topping output = null;
        try {
            final String sql = "Select * from Toppings where tname='" + name + "'";
            PreparedStatement psmt = conn.getConnection().prepareStatement(sql);
            ResultSet rs = psmt.executeQuery();
            int id = 0;
            String tname = name;
            int price = 0;
            while (rs.next()) {
                id = rs.getInt("id");
                price = rs.getInt("price");
            }
            output = new Topping(id, tname, price);
        } catch (SQLException ex) {
            return null;
        }
        return output;
    }

    public Bottom getBottomByName(String name) {
        Bottom output = null;
        try {
            final String sql = "Select * from Bottoms where bname='" + name + "'";
            PreparedStatement psmt = conn.getConnection().prepareStatement(sql);
            ResultSet rs = psmt.executeQuery();
            int id = 0;
            String bname = name;
            int price = 0;
            while (rs.next()) {
                id = rs.getInt("id");
                price = rs.getInt("price");
            }
            output = new Bottom(id, bname, price);
        } catch (SQLException ex) {
            return null;
        }
        return output;
    }

    public User updateBalance(User user, int newBalance) {
        User output = null;
        try {
            final String sql = "Update Accounts set balance = ? where username= ?";
            PreparedStatement psmt = conn.getConnection().prepareStatement(sql);
            psmt.setInt(1, newBalance);
            psmt.setString(2, user.getUsername());
            psmt.executeUpdate();  
            psmt.close();
            
            output = new User(user.getId(), newBalance, user.getUsername(), user.getPassword());
        } catch (SQLException ex) {
        }
        return output;
    }
    

}

/*
public void updateBalance(String name, int newBalance) {
        //User output = null;
        try {
            final String sql = "Update Accounts set balance = " + newBalance + " where username='" + name + "'";
            PreparedStatement psmt = conn.getConnection().prepareStatement(sql);
            ResultSet rs = psmt.executeQuery();
            int id = 0;
            String username = name;
            String password = "";
            int balance = newBalance;
            while (rs.next()) {
                id = rs.getInt("id");
                username = name;
                password = rs.getString("pass");
                balance = newBalance;
            }
            //output = new User(id, balance, username, password);
        } catch (SQLException ex) {
        }
        //return output;
    }
    
*/


    