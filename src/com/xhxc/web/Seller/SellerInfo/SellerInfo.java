package com.xhxc.web.Seller.SellerInfo;



import com.xhxc.pojo.User;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/sell/info")
public class SellerInfo extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();
       User user=(User)session.getAttribute("user");
        req.setAttribute("user",user);
        System.out.println(user);
        req.getRequestDispatcher("/sell/info.jsp").forward(req,resp);
    }
}
