package com.xhxc.web.User;

import com.xhxc.dao.OrderDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user/orderDelete")
public class UserOrderDelete extends HttpServlet {
    OrderDao dao=new OrderDao();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.service(req, resp);
        int orderId=Integer.parseInt(req.getParameter("id"));
        int a=dao.deleteById(orderId);
        if(a>0){
            resp.sendRedirect("/user/usermain");
        }else{
            req.setAttribute("msg","失败");
            req.getRequestDispatcher("../fail.jsp").forward(req,resp);
        }


    }
}
