package classes.servlet.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "loginPage" , urlPatterns = {"/login"})
public class LoginPage extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String message= "";
        if(!checkInvalidInput(username) && !checkInvalidInput(password)){
            message = "Please enter a valid username and password";
            req.setAttribute("message", message);
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
        } else if (!checkInvalidInput(username) || !checkInvalidInput(password)) {
            message = (!checkInvalidInput(username)) ? "Please enter a valid username" : "Please enter a valid password";
            req.setAttribute("message", message);
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
        } else{
            resp.sendRedirect("/forum");
        }

    }
    boolean checkInvalidInput(String input){
        if(input.trim().isEmpty()){
            return false;
        }else{
            return true;
        }
    }
}
