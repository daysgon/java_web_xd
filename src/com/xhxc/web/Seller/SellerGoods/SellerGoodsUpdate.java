package com.xhxc.web.Seller.SellerGoods;

import com.xhxc.dao.GoodsDao;
import com.xhxc.dao.HandleDao;
import com.xhxc.pojo.Goods;
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

@WebServlet("/sell/goodsUpdate")
public class SellerGoodsUpdate extends HttpServlet {
    private GoodsDao dao = new GoodsDao();
    private HandleDao handledao = new HandleDao();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Goods goods = dao.getOneById(id);
        req.setAttribute("goods",goods);
        System.out.println(goods);
        ArrayList<Handle> all = handledao.getHandles();
        req.setAttribute("all",all);

        HttpSession session = req.getSession();
        User user=(User)session.getAttribute("user");
        req.setAttribute("user",user);

        req.getRequestDispatcher("/sell/goodsUpdate.jsp").forward(req,resp);
    }
}
