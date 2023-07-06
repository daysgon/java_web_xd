//管理员端用户列表

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
import java.util.ArrayList;

@WebServlet("/admin/userlist")
public class UserList extends HttpServlet {
private UserDao dao=new UserDao();
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
            ArrayList<User> allusers = dao.getAll();
            req.setAttribute("allusers", allusers);
            req.getRequestDispatcher("/admin/userList.jsp").forward(req, resp);
        }
    }
}
