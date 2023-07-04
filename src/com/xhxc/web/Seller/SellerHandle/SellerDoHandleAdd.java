package com.xhxc.web.Seller.SellerHandle;

import com.xhxc.dao.HandleDao;
import com.xhxc.pojo.Handle;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/sell/doHandleAdd")
public class SellerDoHandleAdd extends HttpServlet {
    private HandleDao dao = new HandleDao();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        int parentId = Integer.parseInt(req.getParameter("parentId"));
        int active = Integer.parseInt(req.getParameter("active"));
        Handle handle = new Handle();
        handle.setParentId(parentId);
        handle.setActive(active);
        handle.setName(name);
        int add = dao.add(handle);
        if (add>0){
            resp.sendRedirect("/sell/handle");
        }else{
            req.setAttribute("msg","添加失败");
            req.getRequestDispatcher("/fail.jsp").forward(req,resp);
        }


    }
}
