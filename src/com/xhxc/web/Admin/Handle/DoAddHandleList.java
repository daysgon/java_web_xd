package com.xhxc.web.Admin.Handle;

import com.xhxc.dao.HandleDao;
import com.xhxc.pojo.Handle;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/admin/doaddhandlelist")
public class DoAddHandleList extends HttpServlet {
    private HandleDao dao=new HandleDao();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        int parentId = Integer.parseInt(req.getParameter("parentId"));
        int active = Integer.parseInt(req.getParameter("active"));

        Handle handle = new Handle();
        handle.setActive(active);
        handle.setParentId(parentId);
        handle.setName(name);

        int add=dao.add(handle);
        if(add>0)
        {
            resp.sendRedirect("/admin/handlelist");
        }
        else
            //需修改
        {req.setAttribute("msg","添加失败");
            req.getRequestDispatcher("/fail.jsp").forward(req,resp);

        }
    }
}
