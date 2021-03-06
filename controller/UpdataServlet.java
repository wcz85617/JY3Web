package com.neuedu.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@WebServlet(name = "UpdataServlet",urlPatterns = "/upload.do")
@MultipartConfig
public class UpdataServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Part file1 = request.getPart("file1");
        String submittedFileName = file1.getSubmittedFileName();
        InputStream inputStream = file1.getInputStream();
        //添加图片名字 避免重复的第一种方法
        //String str = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());

        //避免重复的第二种方法
        UUID str = UUID.randomUUID();

        OutputStream os= new FileOutputStream("C:\\image\\"+str+submittedFileName);
        int buffer = 0;
        byte[] bs = new byte[1024];
        while ((buffer=inputStream.read(bs))!=-1){

            os.write(bs,0,buffer);
        }
        os.close();
        inputStream.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
