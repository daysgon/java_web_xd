package com.xhxc.web.User;

import com.xhxc.dao.OrderDao;
import com.xhxc.pojo.Order;
import com.xhxc.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

@WebServlet("/user/usermain")
public class UserMainWeb extends HttpServlet {
    OrderDao dao=new OrderDao();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        User user=(User)session.getAttribute("user");
        if(user==null){
            req.setAttribute("msg","请登录");
            req.getRequestDispatcher("/index/loginFail.jsp").forward(req,resp);
        }else{
            ArrayList<Order> all=dao.getGoodsByPurcherId(user.getId());
//        ArrayList<Order> all=dao.getGoodsByPurcherId(1);

            System.out.println(all);
            double totalPrice=0;
            for(int i=0;i<all.size();i++){
                System.out.println(totalPrice+=all.get(i).getPrice()*all.get(i).getAmount());
            }
            req.setAttribute("totalPrice",totalPrice);
            req.setAttribute("all",all);
            req.getRequestDispatcher("/user/usermain.jsp").forward(req,resp);
        }

    }
}
