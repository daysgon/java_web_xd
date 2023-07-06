package com.xhxc.web.User;

import com.xhxc.dao.UserDao;
import com.xhxc.pojo.Handle;
import com.xhxc.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/user/infoUpdate")
public class UserInfoUpdate extends HttpServlet {
    User user=new User();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDao dao=new UserDao();

        HttpSession session = req.getSession();
        User user=(User)session.getAttribute("user");
        if(user==null){
            req.setAttribute("msg","请登录");
            req.getRequestDispatcher("/index/loginFail.jsp").forward(req,resp);
        }else{
            req.setAttribute("user",user);
            req.getRequestDispatcher("/user/infoUpdate.jsp").forward(req,resp);
        }

//        user=dao.getOneById(3);

    }
}
