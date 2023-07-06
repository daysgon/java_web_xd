package com.xhxc.web.Seller.SellerGoods;

import com.xhxc.dao.GoodsDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/sell/goodsDelete")
public class SellerGoodsDelete extends HttpServlet {
    private GoodsDao dao = new GoodsDao();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        int del = dao.del(id);
        resp.sendRedirect("/sell/goods");
    }
}
