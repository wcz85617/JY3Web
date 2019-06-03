package com.neuedu.controller;

import com.neuedu.dao.UserDao;
import com.neuedu.pojo.User;
import com.neuedu.dao.UserDameImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "UserServlet",urlPatterns = "/user.do")
public class UserServlet extends HttpServlet {

    private UserDao ud;
    @Override
    public void init() throws ServletException {
        ud = new UserDameImpl();

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> users = ud.getAllUser();
        //System.out.println(users);
        request.setAttribute("users",users);
        request.getRequestDispatcher("/index.jsp").forward(request,response);



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
               doPost(request,response);
    }
}
