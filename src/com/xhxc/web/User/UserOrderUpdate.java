package com.xhxc.web.User;

import com.xhxc.dao.GoodsDao;
import com.xhxc.dao.OrderDao;
import com.xhxc.pojo.Goods;
import com.xhxc.pojo.Order;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user/orderUpdate")
public class UserOrderUpdate extends HttpServlet {
//    GoodsDao goodsdao=new GoodsDao();
    OrderDao dao=new OrderDao();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int orderId=Integer.parseInt(req.getParameter("id"));
//        Goods good=goodsdao.getById(id)
        Order order=new Order();
        order=dao.getOrderById(orderId);
        req.setAttribute("order",order);
        req.getRequestDispatcher("/user/orderUpdateWeb.jsp").forward(req,resp);
    }
}
