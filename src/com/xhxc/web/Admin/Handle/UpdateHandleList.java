package com.xhxc.web.Admin.Handle;

import com.xhxc.dao.HandleDao;
import com.xhxc.pojo.Handle;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/admin/updatehandlelist")
public class UpdateHandleList extends HttpServlet {
    private HandleDao dao=new HandleDao();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        int id = Integer.parseInt(req.getParameter("id"));
        System.out.println(id);
//        根据id查询当前的修改的这条数据
        ArrayList<Handle> allparenthandles =dao.getHandlesByParentId();

        Handle oneById = dao.getOneById(id);
        System.out.println(oneById);
        req.setAttribute("handle",oneById);
        req.setAttribute("allparenthandles",allparenthandles);
        req.getRequestDispatcher("/admin/updateHandleList.jsp").forward(req,resp);

    }
}
