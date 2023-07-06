package com.xhxc.web.Seller.SellerInfo;


import com.xhxc.dao.UserDao;
import com.xhxc.pojo.User;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/sell/info")
public class SellerInfo extends HttpServlet {
    private UserDao dao=new UserDao();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //        HttpSession session = req.getSession();
//        User user=(User)session.getAttribute("user");
        User user=dao.getOneById(3);
        req.setAttribute("user",user);
        System.out.println(user);
        req.getRequestDispatcher("/sell/info.jsp").forward(req,resp);
    }
}
