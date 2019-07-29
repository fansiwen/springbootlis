package com.fsw.lis.springbootlis.pattern.delegate.mvc;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DispatcherServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        dodispatcher(req,resp);
    }

    private void dodispatcher(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String url = req.getRequestURI();
        String mid = req.getParameter("mid");
        if("getMemberByID".equals(url)){
            new MemberController().getMemberByID(mid);
        }else if("getOrderByID".equals(url)){
            new OrderController().getOrderByID(mid);
        }else if("logout".equals(url)){
            new SystemController().logout();
        }else {
            resp.getWriter().write("404 not found");
        }
    }
}
