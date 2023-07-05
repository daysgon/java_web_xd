package com.xhxc.web.Admin.Goods;

import com.xhxc.dao.GoodsDao;
import com.xhxc.pojo.Goods;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/admin/goodslist")
public class GoodsList extends HttpServlet {
    private GoodsDao dao=new GoodsDao();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<Goods> allgoods=dao.getAll();
        req.setAttribute("allgoods",allgoods);
        req.getRequestDispatcher("/admin/goodsList.jsp").forward(req,resp);
    }
}
