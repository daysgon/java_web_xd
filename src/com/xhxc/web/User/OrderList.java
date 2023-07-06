package com.xhxc.web.User;



import com.xhxc.dao.OrderDao;
import com.xhxc.pojo.Order;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/user/orderlist")
public class OrderList extends HttpServlet{
    private OrderDao dao=new OrderDao();


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int user_id = Integer.parseInt(req.getParameter("user_id"));
        ArrayList<Order> allorders=dao.getGoodsByPurcherId(user_id);
        req.setAttribute("allorders",allorders);
        req.getRequestDispatcher("/user/orderlist.jsp").forward(req,resp);
    }
}
