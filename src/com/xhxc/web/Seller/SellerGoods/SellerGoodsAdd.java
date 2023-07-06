package com.xhxc.web.Seller.SellerGoods;

import com.xhxc.dao.HandleDao;
import com.xhxc.pojo.Handle;
import com.xhxc.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/sell/goodsAdd")
public class SellerGoodsAdd extends HttpServlet {
    private HandleDao dao = new HandleDao();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<Handle> all = dao.getHandles();
        req.setAttribute("all",all);

        HttpSession session = req.getSession();
        User user=(User)session.getAttribute("user");
        req.setAttribute("user",user);

        req.getRequestDispatcher("/sell/goodsAdd.jsp").forward(req,resp);
    }
}
