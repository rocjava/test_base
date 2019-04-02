package com.test.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2019/4/2.
 */
public class IndexServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("test/html; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        String userName = (String) request.getSession().getAttribute("userName");
        if(userName == null){
            System.out.println("======not login.");
            response.sendRedirect(request.getContextPath() +"/initLogin.do");
        }else{
            System.out.println("======into index.");
            request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
        }

    }
}
