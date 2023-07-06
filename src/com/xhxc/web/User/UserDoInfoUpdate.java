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

@WebServlet("/user/doInfoUpdate")
public class UserDoInfoUpdate extends HttpServlet {
    UserDao dao=new UserDao();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session=req.getSession();
        User user_previous=(User)session.getAttribute("user");
        if(user_previous==null){
            req.setAttribute("msg","请登录");
            req.getRequestDispatcher("/index/loginFail.jsp").forward(req,resp);
        }else{
            String username = req.getParameter("username");
            String email = req.getParameter("email");
            String phone = req.getParameter("phone");
            String address = req.getParameter("address");
            String password = req.getParameter("password");
            User user=new User();
            user.setId(user_previous.getId());
//            user.setId(3);
            user.setAddress(address);
            user.setPhone(phone);
            user.setUsername(username);
            user.setEmail(email);
            user.setPassword(password);
            System.out.println(user);
            int a=dao.update(user);
            if(a>0){
                session.setAttribute("user",user);
                req.getRequestDispatcher("/user/usermain").forward(req,resp);
            }else{
                req.setAttribute("msg","失败");
                req.getRequestDispatcher("../fail.jsp").forward(req,resp);
            }

        }





    }
}
