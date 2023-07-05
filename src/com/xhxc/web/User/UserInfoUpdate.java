package com.xhxc.web.User;

import com.xhxc.dao.UserDao;
import com.xhxc.pojo.Handle;
import com.xhxc.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user/infoUpdate")
public class UserInfoUpdate extends HttpServlet {
    User user=new User();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDao dao=new UserDao();
        user=dao.getOneById(3);
        req.setAttribute("user",user);
        req.getRequestDispatcher("/user/infoUpdate.jsp").forward(req,resp);
    }
}