package Controller;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
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
public class DBConnector {
    private Connection conn = null;

    //Constants
    private static final String IP = "159.65.126.99";
    private static final int PORT = 3306;
    public static final String DATABASE = "cupbruger";
    private static final String USERNAME = "tob";
    private static final String PASSWORD = "1234";

    public DBConnector() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://" + IP + ":" + PORT + "/" + DATABASE;
            this.conn = (Connection) DriverManager.getConnection(url, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | InstantiationException | SQLException | IllegalAccessException ex) {
            Logger.getLogger(DBConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Connection getConnection() {
        return this.conn;
    }
    
}
