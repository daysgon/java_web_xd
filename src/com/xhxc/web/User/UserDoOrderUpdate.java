package com.xhxc.web.User;

import com.sun.org.apache.xpath.internal.operations.Or;
import com.xhxc.dao.GoodsDao;
import com.xhxc.dao.OrderDao;
import com.xhxc.dao.UserDao;
import com.xhxc.pojo.Goods;
import com.xhxc.pojo.Order;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user/doOrderUpdate")
public class UserDoOrderUpdate extends HttpServlet {
    OrderDao orderdao= new OrderDao();
    GoodsDao goodsdao=new GoodsDao();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int amount=Integer.parseInt(req.getParameter("amount"));
        String address=req.getParameter("address");
        int orderId=Integer.parseInt(req.getParameter("id"));
        Order order_previous=new Order();
        Order order=new Order();

        Goods good=new Goods();


        order_previous=orderdao.getOrderById(orderId);
        order=orderdao.getOrderById(orderId);
        good=goodsdao.getById(order_previous.getGoodId());
        if((amount>order_previous.getAmount()+good.getStore())|| amount<=0  ){
            req.setAttribute("msg","失败");
            req.getRequestDispatcher("../fail.jsp").forward(req,resp);
        }else{
//            order=order_previous;
            order.setAmount(amount);
            System.out.println(order);
            int a=orderdao.update(order);
            good.setStore(good.getStore()+order_previous.getAmount()-amount);
            System.out.println(good);
            int b=goodsdao.update(good);
            System.out.println("updategoods"+b);
            resp.sendRedirect("/user/usermain");

        }

    }
}
