package com.xhxc.web.Seller.SellerGoods;

import com.xhxc.dao.GoodsDao;
import com.xhxc.pojo.Goods;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/sell/goods")
public class SellerGoods extends HttpServlet {
    private GoodsDao dao = new GoodsDao();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ArrayList<Goods> all = dao.getAll();
        req.setAttribute("all",all);
        req.getRequestDispatcher("/sell/handle.jsp").forward(req,resp);

    }
}
