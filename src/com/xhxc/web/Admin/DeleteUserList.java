package com.xhxc.web.Admin;

import com.xhxc.dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/deleteuserlist")
public class DeleteUserList extends HttpServlet {
private UserDao dao=new UserDao();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));

        int delete=dao.delete(id);
        if (delete>0){
            resp.sendRedirect("/userlist");
        }else{
            req.setAttribute("msg","删除失败");
            req.getRequestDispatcher("/fail.jsp").forward(req,resp);
        }




    }
}
