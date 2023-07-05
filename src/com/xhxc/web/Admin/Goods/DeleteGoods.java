package com.xhxc.web.Admin.Goods;

import com.xhxc.dao.GoodsDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/admin/deletegoodslist")
public class DeleteGoods extends HttpServlet {
private GoodsDao dao=new GoodsDao();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        int delete=dao.del(id);
        if (delete>0){
            resp.sendRedirect("/admin/goodslist");
        }else{
            req.setAttribute("msg","删除失败");
            req.getRequestDispatcher("/fail.jsp").forward(req,resp);
        }
    }
}
