package Controller;


import Controller.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sidad
 */
@WebServlet(name = "RegistrationController", urlPatterns = {"/RegistrationController"})
public class RegistrationController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        String newuser = request.getParameter("newuser");
        String newpass = request.getParameter("newpass");
        String balance = request.getParameter("balance");
        
        DataAccess da = new DataAccess();
        
        User testUser = da.getUserByName(newuser);

        //Tjekker for tomt input
        if (newuser.isEmpty() || newpass.isEmpty() || balance.isEmpty()) {
            request.getRequestDispatcher("regerror.jsp").forward(request, response);
        } 
        //Tjekker om useren allerede findes
        if (testUser.getId() != 0) {
            request.getRequestDispatcher("error_user_exists.jsp").forward(request, response);
        } else {
            int intBalance = Integer.parseInt(balance);
            User newUser = new User(intBalance, newuser, newpass);
            da.newAccount(newUser);
            RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
            rd.include(request, response);
        }

    }
}
