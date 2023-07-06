package com.xhxc.web.Admin.Goods;

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

@WebServlet("/admin/goodslist")
public class GoodsList extends HttpServlet {
    private GoodsDao dao=new GoodsDao();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        User user=(User)session.getAttribute("user");
        if(user==null)
        {req.setAttribute("msg","请登录");
            req.getRequestDispatcher("/index/loginFail.jsp").forward(req,resp);

        }
        else
            {
            ArrayList<Goods> allgoods = dao.getAll();
            req.setAttribute("allgoods", allgoods);
            req.getRequestDispatcher("/admin/goodsList.jsp").forward(req, resp);
        }
    }
}
