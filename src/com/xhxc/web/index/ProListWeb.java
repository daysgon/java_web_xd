package com.xhxc.web.index;

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

@WebServlet("/proList")
public class ProListWeb extends HttpServlet {
    private GoodsDao dao = new GoodsDao();
    private HandleDao dao1 = new HandleDao();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int hid = Integer.parseInt(req.getParameter("hid"));
        Handle handle = new Handle();
        handle = dao1.getOneById(hid);
        System.out.println(handle);
        String handleName = handle.getName();
        System.out.println(handleName);
        ArrayList<Goods> all = dao.getAllByHid(hid);
        System.out.println(all);
        req.setAttribute("all",all);
        req.setAttribute("hName",handleName);
        req.getRequestDispatcher("/index/proList.jsp").forward(req,resp);
    }
}

