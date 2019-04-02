package com.test.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2019/4/2.
 */
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("test/html; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");

        String userName = request.getParameter("userName");
        String passCode = request.getParameter("passCode");

        System.out.println("======userName:" +userName);
        System.out.println("======passCode:" +passCode);

        if("admin".equalsIgnoreCase(userName) && "123456".equals(passCode)){
            request.getSession().setAttribute("userName", userName);
            request.getSession().setMaxInactiveInterval(10);
            System.out.println("======login success.");
            response.sendRedirect(request.getContextPath() +"/index.do");
        }else{
            request.setAttribute("loginInfo", "Login Fail.");
            System.out.println("======login fail.");
            request.getRequestDispatcher("/WEB-INF/fail.jsp").forward(request, response);
        }

    }

}
