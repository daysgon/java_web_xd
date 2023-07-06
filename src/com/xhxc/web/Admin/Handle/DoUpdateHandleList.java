package com.xhxc.web.Admin.Handle;

import com.xhxc.dao.HandleDao;
import com.xhxc.pojo.Handle;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/admin/doupdatehandlelist")
public class DoUpdateHandleList extends HttpServlet {
    private HandleDao dao=new HandleDao();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getParameter("id"));
        System.out.println(req.getParameter("name"));
        System.out.println(req.getParameter("parentId"));
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        int parentId = Integer.parseInt(req.getParameter("parentId"));
        int active = Integer.parseInt(req.getParameter("active"));
        Handle handle=new Handle();
        handle.setName(name);
        handle.setParentId(parentId);
        handle.setId(id);
        handle.setActive(active);
        int update=dao.update(handle);
        if (update>0){
            resp.sendRedirect("/admin/handlelist");
        }else{
            req.setAttribute("msg","修改失败");
            req.getRequestDispatcher("/fail.jsp").forward(req,resp);
        }
    }
}
