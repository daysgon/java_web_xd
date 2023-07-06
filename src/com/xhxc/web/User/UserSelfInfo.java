package com.xhxc.web.User;

import com.xhxc.dao.UserDao;
import com.xhxc.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/user/self_info")
public class UserSelfInfo extends HttpServlet {
    UserDao dao=new UserDao();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();
        User user=(User)session.getAttribute("user");
        if(user==null){
            req.setAttribute("msg","请登录");
            req.getRequestDispatcher("/index/loginFail.jsp").forward(req,resp);
        }else{
//            User user=dao.getOneById(3);
            req.setAttribute("user",user);
            System.out.println(user);
            req.getRequestDispatcher("/user/self_info.jsp").forward(req,resp);
        }


    }
}
