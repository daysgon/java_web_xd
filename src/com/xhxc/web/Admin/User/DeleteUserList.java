package com.xhxc.web.Admin.User;

import com.xhxc.dao.UserDao;
import com.xhxc.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/admin/deleteuserlist")
public class DeleteUserList extends HttpServlet {
private UserDao dao=new UserDao();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        User user=(User)session.getAttribute("user");
        if(user==null)
        {req.setAttribute("msg","请登录");
            req.getRequestDispatcher("/index/loginFail.jsp").forward(req,resp);

        }
        else {
            int id = Integer.parseInt(req.getParameter("id"));

            int delete = dao.delete(id);
            if (delete > 0) {
                resp.sendRedirect("/admin/userlist");
            } else {
                req.setAttribute("msg", "删除失败");
                req.getRequestDispatcher("/fail.jsp").forward(req, resp);
            }
        }



    }
}
