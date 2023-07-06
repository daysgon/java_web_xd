package com.xhxc.web.index;

import com.xhxc.dao.GoodsDao;
import com.xhxc.pojo.Goods;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/proDetails")
public class ProDetailsWeb extends HttpServlet {
    private GoodsDao dao = new GoodsDao();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Goods goods =new Goods();
        goods = dao.getById(id);
        req.setAttribute("goods",goods);
        req.getRequestDispatcher("/index/proDetails.jsp").forward(req,resp);
    }
}
