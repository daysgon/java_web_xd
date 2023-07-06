//点击添加用户后跳转添加界面


package com.xhxc.web.Admin.User;

import com.xhxc.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/admin/adduserlist")
public class AddUserList extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        User user=(User)session.getAttribute("user");
        if(user==null)
        {req.setAttribute("msg","请登录");
            req.getRequestDispatcher("/index/loginFail.jsp").forward(req,resp);

        }
        else {
            req.getRequestDispatcher("/admin/addUserList.jsp").forward(req, resp);
        }
    }
}
