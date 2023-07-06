package com.xhxc.web.User;

import com.xhxc.dao.OrderDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user/deleteorder")
public class DeleteOrder extends HttpServlet {
    private OrderDao dao=new OrderDao();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int good_id = Integer.parseInt(req.getParameter("good_id"));

        int delete=dao.delete(good_id);
        if (delete>0){
            resp.sendRedirect("/user/orderlist");
        }else{
            req.setAttribute("msg","删除失败");
            req.getRequestDispatcher("/fail.jsp").forward(req,resp);
        }




    }
}

