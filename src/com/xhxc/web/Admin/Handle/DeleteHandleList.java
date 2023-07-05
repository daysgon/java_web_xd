package com.xhxc.web.Admin.Handle;

import com.xhxc.dao.HandleDao;
import com.xhxc.pojo.Handle;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/admin/deletehandlelist")
public class DeleteHandleList extends HttpServlet {
    private HandleDao dao=new HandleDao();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));


        int delete=dao.delete(id);
        if (delete>0){
            resp.sendRedirect("/admin/handlelist");
        }else{
            req.setAttribute("msg","删除失败");
            req.getRequestDispatcher("/fail.jsp").forward(req,resp);
        }



    }
}
