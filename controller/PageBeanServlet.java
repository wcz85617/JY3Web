package com.neuedu.controller;

import com.neuedu.Service.pageBeanService;
import com.neuedu.Service.pageBeanServiceImpl;
import com.neuedu.pojo.pageBean;
import net.sf.json.JSONArray;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PageBeanServlet")
public class PageBeanServlet extends HttpServlet {

    private pageBeanService pb;
    public PageBeanServlet(){
        pb = new pageBeanServiceImpl();
    }


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pageNum = req.getParameter("pageNum");
        int i = Integer.parseInt(pageNum);
        pageBean pageBean = pb.getPageBean(i, 3);
        JSONArray jsonArray = JSONArray.fromObject(pageBean);



    }
}
