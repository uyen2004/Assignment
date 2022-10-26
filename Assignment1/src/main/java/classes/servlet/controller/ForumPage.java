package classes.servlet.controller;

import classes.servlet.data.DataBase;
import classes.servlet.data.Entry;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "forumPage", urlPatterns = {"/forum"})
public class ForumPage extends HttpServlet {
    DataBase dataBase = new DataBase();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String message = req.getParameter("message");
        Entry entry = new Entry(username, message);
        String action = req.getParameter("action");

        if("Submit".equals(action)) {
            DataBase.addEntry(entry);
            req.setAttribute("entries", dataBase.entries);
            req.getRequestDispatcher("/forum.jsp").forward(req, resp);
        }else if("Search".equals(action)){
            String foundEntry = (DataBase.searchByUsername(username) != null) ? (DataBase.searchByUsername(username)) : "No username is found";
            req.setAttribute("result", foundEntry);
            req.getRequestDispatcher("/searchEntry.jsp").forward(req, resp);
        }

    }
}
