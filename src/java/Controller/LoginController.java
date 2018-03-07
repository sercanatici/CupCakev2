package Controller;


import Controller.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.jms.Session;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sidad
 */

     @WebServlet(name ="LoginController", urlPatterns = {"/LoginController"})
public class LoginController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    DataAccess da = new DataAccess();
    @Override
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
       
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        User loggedInUser = da.getUserByName(user);
        
         //Tjekker tomt input
            if(user.isEmpty() || pass.isEmpty()){
                request.getRequestDispatcher("wrongpass.jsp").forward(request, response);
            }
         //Tjekker rigtigt password
            if(!loggedInUser.getPassword().equals(pass)){
                request.getRequestDispatcher("wrongpass.jsp").forward(request, response);
            }
         //Sender til homepage og putter user i session
            else{
                HttpSession sesh = request.getSession();
                sesh.setAttribute("user", loggedInUser);
                request.getRequestDispatcher("homepage.jsp").forward(request, response);
            }
    }
}
    

