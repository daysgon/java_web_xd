package com.xhxc.web.Seller.SellerGoods;

import com.xhxc.dao.GoodsDao;
import com.xhxc.pojo.Goods;
import com.xhxc.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/sell/goods")
public class SellerGoods extends HttpServlet {
    private GoodsDao dao = new GoodsDao();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();
        User user=(User)session.getAttribute("user");

        int uid = user.getId();
        ArrayList<Goods> goods = dao.getUid(uid);
        req.setAttribute("goods",goods);
        req.getRequestDispatcher("/sell/goods.jsp").forward(req,resp);

    }
}
