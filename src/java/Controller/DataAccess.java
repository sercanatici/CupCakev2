package Controller;

import Controller.User;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
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

    public void newAccount(User user) {
        try {
            final String sql = "INSERT INTO Accounts"
                    + "(username,pass,balance) "
                    + "VALUES (?,?,?)";
            PreparedStatement st = conn.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            st.setString(1, user.getUsername());
            st.setString(2, user.getPassword());
            st.setInt(3, user.getBalance());
            st.executeUpdate();

            try (ResultSet generatedKeys = st.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    user.setId(generatedKeys.getInt(1));
                } else {
                    throw new SQLException("Creating user failed, no ID obtained");
                }
            }
        } catch (SQLException ex) {
        }
    }

    public User getUserByName(String name) {
        User output = null;
        try {
            final String sql = "Select * from Accounts where username = ?";
            PreparedStatement st = conn.getConnection().prepareStatement(sql);

            st.setString(1, name);

            ResultSet rs = st.executeQuery();
            int id = 0;
            String username = name;
            String pass = "";
            int balance = 0;
            while (rs.next()) {
                id = rs.getInt("accountId");
                pass = rs.getString("pass");
                balance = rs.getInt("balance");
            }

            output = new User(balance, username, pass);
            output.setId(id);
        } catch (SQLException ex) {
            return null;
        }
        return output;
    }

    public Topping getToppingByName(String name) {
        Topping output = null;
        try {
            final String sql = "Select * from Toppings where tname = ?";
            PreparedStatement st = conn.getConnection().prepareStatement(sql);

            st.setString(1, name);

            ResultSet rs = st.executeQuery();
            int id = 0;
            String tname = name;
            int price = 0;
            while (rs.next()) {
                id = rs.getInt("toppingId");
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
            final String sql = "Select * from Bottoms where bname = ?";
            PreparedStatement st = conn.getConnection().prepareStatement(sql);

            st.setString(1, name);

            ResultSet rs = st.executeQuery();
            int id = 0;
            String bname = name;
            int price = 0;
            while (rs.next()) {
                id = rs.getInt("bottomId");
                price = rs.getInt("price");
            }
            output = new Bottom(id, bname, price);
        } catch (SQLException ex) {
            return null;
        }
        return output;
    }

    public Topping getToppingById(int id) {
        Topping output = null;
        try {
            final String sql = "select * from Toppings where toppingId = ?";
            PreparedStatement st = conn.getConnection().prepareStatement(sql);

            st.setInt(1, id);

            ResultSet rs = st.executeQuery();
            String tname = "";
            int price = 0;
            while (rs.next()) {
                tname = rs.getString("tname");
                price = rs.getInt("price");
            }
            output = new Topping(id, tname, price);
        } catch (SQLException ex) {
            return null;
        }
        return output;
    }

    public Bottom getBottomById(int id) {
        Bottom output = null;
        try {
            final String sql = "select * from Bottoms where bottomId = ?";
            PreparedStatement st = conn.getConnection().prepareStatement(sql);

            st.setInt(1, id);

            ResultSet rs = st.executeQuery();
            String bname = "";
            int price = 0;
            while (rs.next()) {
                bname = rs.getString("bname");
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
            final String sql = "Update Accounts "
                    + "set balance = ? "
                    + "where username = ?";
            PreparedStatement st = conn.getConnection().prepareStatement(sql);
            st.setInt(1, newBalance);
            st.setString(2, user.getUsername());
            st.executeUpdate();
            st.close();

            output = new User(newBalance, user.getUsername(), user.getPassword());
        } catch (SQLException ex) {
        }
        return output;
    }

    private void makeLineItem(LineItem li, int orderId) {
        try {
            final String sql = "Insert into LineItem"
                    + "(quantity, price, toppingId, bottomId, orderId)"
                    + " Values (?,?,?,?,?) ";
            PreparedStatement st = conn.getConnection().prepareStatement(sql);

            st.setInt(1, li.getQuantity());
            st.setInt(2, li.getPrice());
            st.setInt(3, li.getTopping().getId());
            st.setInt(4, li.getBottom().getId());
            st.setInt(5, orderId);
            st.executeUpdate();

        } catch (SQLException ex) {
        }
    }

    public void makeOrder(ArrayList<LineItem> li, User user) {
        try {
            Calendar cal = Calendar.getInstance();
            String date = cal.getTime().toString();
            final String sql = "Insert into Orders"
                    + "(dato, accountId) "
                    + "values(?,?)";
            PreparedStatement st = conn.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            st.setString(1, date);
            st.setInt(2, user.getId());
            st.executeUpdate();

            try (ResultSet generatedKeys = st.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    int orderId = generatedKeys.getInt(1);
                    for (int i = 0; i < li.size(); i++) {
                        makeLineItem(li.get(i), orderId);
                    }
                } else {
                    throw new SQLException("No auto generated key obtained");
                }
            }

        } catch (SQLException ex) {

        }
    }

    public ArrayList<GetOrder> getOrders(User user) {

        
        ArrayList<GetOrder> array = new ArrayList();
        try {
            
            ArrayList<LineItem> lsa = getLineItem(user.getId());
            
           int totalPrice = 0;

            final String sql = "Select * from Orders "
                    + "where Orders.accountId = ?";
            PreparedStatement st = conn.getConnection().prepareStatement(sql);

            st.setInt(1, user.getId());

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                int orderId = rs.getInt("orderId");
                String date = rs.getString("dato");
                
                for (int i = 0; i<lsa.size(); i++){
                totalPrice += lsa.get(i).getPrice();
            }
                
                array.add(new GetOrder(orderId, date, lsa, totalPrice));
                
                
            }


        } catch (SQLException ex) {
            return null;
        }
        return array;
    }

    
    private ArrayList<LineItem> getLineItem(int orderId){
        ArrayList<LineItem> array = new ArrayList();
        
        try{
            final String sql = "Select * from LineItem where orderId = ?";
            
            PreparedStatement st = conn.getConnection().prepareStatement(sql);
            
            st.setInt(1, orderId);
            
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                int intBottom = rs.getInt("bottomId");
                int intTopping = rs.getInt("toppingId");
                int quantity = rs.getInt("quantity");
                int price = rs.getInt("price");
                
                Bottom bottom = getBottomById(intBottom);
                Topping topping = getToppingById(intTopping);
                
                array.add(new LineItem(bottom, topping, quantity, price));
            }
                    
        }catch (SQLException ex){
            return null;
        }
        return array;
    }
}
